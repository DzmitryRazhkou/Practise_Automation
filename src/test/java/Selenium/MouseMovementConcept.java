package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

//        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.spicejet.com");   // Enter URL
        System.out.println("Page has Loaded" + "\n_______________");
//
//        WebElement wheelBtn = driver.findElement(By.xpath("//*[text()='Add-ons']"));
        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.linkText("Add-ons"))).build().perform();   By linkText
        action.moveToElement(driver.findElement(By.xpath("//*[text()='Add-ons']"))).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Visa Services"));
    }
}
