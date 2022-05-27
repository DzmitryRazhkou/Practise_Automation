package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowseButtonWindowPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://html.com/input-type-file/");   // Enter URL
        System.out.println("Page was Loaded" + "\n_______________");

        WebElement uploadBtn = driver.findElement(By.cssSelector("#fileupload"));
        uploadBtn.sendKeys("/Users/dzmitryrazhkou/Desktop/test.xlsx");
    }
}
