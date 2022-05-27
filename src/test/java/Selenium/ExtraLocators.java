package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.util.concurrent.TimeUnit;

public class ExtraLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver

        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");   // Enter URL

//        driver.findElement(new ByAll(By.name("email"), By.id("email"), By.xpath("//*[@placeholder='Email or phone number']")))
//                .sendKeys("dzmitryrazhkou@gmail.com");
        driver.findElement(new ByIdOrName("email")).sendKeys("dzmitryrazhkou@gmail.com");
    }

}
