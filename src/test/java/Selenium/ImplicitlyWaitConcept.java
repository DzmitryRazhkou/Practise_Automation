package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWaitConcept {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver

        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome
        driver.get("https://jqueryui.com/droppable/");   // Enter URL

        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
}
