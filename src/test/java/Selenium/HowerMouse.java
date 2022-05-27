package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HowerMouse {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver

        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome
        WebDriverWait wait = new WebDriverWait(driver,10);   //Wait

        driver.get("https://www.ebay.com");   // Enter URL

        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Actions action = new Actions(driver);

        WebElement electronicBtn = driver.findElement(By.linkText("Electronics"));

        wait.until(ExpectedConditions.elementToBeClickable(electronicBtn));
        action.moveToElement(electronicBtn).build().perform();

        WebElement iphone = driver.findElement(By.linkText("iPhones"));
        wait.until(ExpectedConditions.elementToBeClickable(iphone));

        action.moveToElement(iphone).build().perform();
        iphone.click();

        driver.close();
        driver.quit();



    }
}
