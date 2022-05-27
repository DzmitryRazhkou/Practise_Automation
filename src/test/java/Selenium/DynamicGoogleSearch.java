package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicGoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");   // Enter URL

        WebElement searchFiled = driver.findElement(By.cssSelector("input[title='Search']"));
        searchFiled.sendKeys("testing");

//        //ul[@role='listbox']//li/descendant::div[@class='wM6W7d'] - Dynamic Customized Xpath
//        Thread.sleep(1500);

        List<WebElement> list = driver.findElements
                (By.xpath(("//ul[@role='listbox']//li//following::div[@class='pcTkSc']/following::div[@class='wM6W7d']/following::span")));
        System.out.println("Total numbers of list: " +list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("testing for covid")){
                list.get(i).click();
                break;
            }
        }
    }
}
