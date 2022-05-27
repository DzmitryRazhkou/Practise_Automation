package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage {

    @Test
    public void errorMessageApp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String Url = "https://login.yahoo.com/";

        driver.get(Url);

        driver.findElement(By.cssSelector("#login-signin")).click();
        Thread.sleep(1500);

        String actual_error = driver.findElement(By.cssSelector("#username-error")).getText();
        System.out.println(actual_error);
        String expected_error = "Sorry, we don't recognize this email.";

//        Type 1

//        Assert.assertEquals(actual_error, expected_error);
//        driver.quit();

//        Type 2

        Assert.assertTrue(actual_error.contains("Sorry, we don't recognize this email."));
        driver.close();

    }
}
