package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScrollPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com/";

        driver.get(url);

        WebElement searchFiled = driver.findElement(By.xpath("//*[@title='Search']"));
        WebElement help = driver.findElement(By.xpath("//*[@class='wHYlTd ZYHQ7e']"));
        searchFiled.sendKeys("Philadelphia");
        Thread.sleep(2500);
        searchFiled.sendKeys(Keys.RETURN);




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", help);

//        js.executeScript("arguments[0].scrollIntoView();", playlist);
    }
}
