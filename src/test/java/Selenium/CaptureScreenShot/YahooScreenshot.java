package Selenium.CaptureScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class YahooScreenshot {

    @Test
    public void captureScreenshot() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        Utility.captureScreenShot(driver, "BrowserStared");
        driver.findElement(By.cssSelector("#login-signin")).click();

        Utility.captureScreenShot(driver, "TypeName");
        driver.quit();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(""));

    }

}
