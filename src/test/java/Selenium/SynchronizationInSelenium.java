package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SynchronizationInSelenium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver

        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        // Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        Selenium not recommend to use implicit and explicit wait together, it will be added together.

        driver.get("https://www.facebook.com");   // Enter URL

//        driver.manage().window().maximize();   // Maximize Window
//        driver.manage().deleteAllCookies();   // Delete All the Cookies

        WebElement emailFiled = driver.findElement(By.xpath("//*[@name='email']"));
        WebElement passwordFiled = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@name='login']"));

        sendKeys(driver, emailFiled, 10, "dzmitryrazhkou@gmail.com");
        sendKeys(driver, passwordFiled, 10, "3036057Dr");
        click(driver, loginBtn, 10);


    }

    public static void sendKeys (WebDriver driver, WebElement element, int timeout, String value){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);

    }

    public static void click (WebDriver driver, WebElement element, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


}
