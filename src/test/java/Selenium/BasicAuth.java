package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class BasicAuth {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//        https://admin:admin@herokuapp.com/basic_auth
//        https://username:password@herokuapp.com/basic_auth

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");   // Enter URL

        String message = driver.findElement(By.cssSelector("div[class='example']")).getText();
        System.out.println(message);


    }
}
