package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropConcept {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

//        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");   // Enter URL
        System.out.println("Page has Loaded" + "\n_______________");

        driver.switchTo().frame(0);

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
              .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
              .release()
              .build()
              .perform();



    }
}
