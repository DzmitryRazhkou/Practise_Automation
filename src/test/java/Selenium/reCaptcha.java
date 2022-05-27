package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class reCaptcha {

    @Test
    public void ReCaptcha() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        opt.addArguments("disable-infobars");
        opt.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(opt);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("https://www.google.com/recaptcha/api2/demo");

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@title='reCAPTCHA']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

        driver.quit();

    }
}

