package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CaptchaSeleniumUsingTesseractOCR_Numbers {
    @Test
    public void captchaHandle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();

        WebElement covidAlert = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
        covidAlert.click();


        Thread.sleep(2500);
        driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();

//        driver.findElement(By.id("4690032")).click();

//        driver.quit();
    }
}
