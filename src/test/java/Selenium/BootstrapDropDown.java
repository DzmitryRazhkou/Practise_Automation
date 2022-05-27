package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BootstrapDropDown {

    public static WebDriverWait wait;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome



        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");   // Enter URL
        System.out.println("Page was Loaded" + "\n_______________");


        WebElement bootBtn = driver.findElement(By.xpath("//*[@class='btn btn-info btn-sm dropdown-toggle']"));
        bootBtn.click();

        List<WebElement> listOfDD = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/label"));  // List of label in DD Menu

        for (int i = 0; i < listOfDD.size(); i++) {
            System.out.println(listOfDD.get(i).getText());
            if (listOfDD.get(i).getText().contains("JavaScript")){
                listOfDD.get(i).click();
                break;
            }
        }




    }
}
