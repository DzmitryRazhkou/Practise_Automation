package Selenium.CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YahooScreenshot {

    @Test
    public void captureScreenshot() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        Utility.captureScreenShot(driver, "BrowserStared");
        driver.findElement(By.cssSelector("#login-signin")).click();

        Utility.captureScreenShot(driver, "TypeName");
        driver.quit();

    }

}
