package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class _TakeScreenShot {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.navigate().to("https://www.google.com");
        takeScreenShot("pizdec");
    }
        
        public static void takeScreenShot (String fileName) throws IOException {
        
        
        String path = "/Users/dzmitryrazhkou/Desktop/";
        String ext = ".jpg";

//            "/Users/dzmitryrazhkou/Desktop/pizdec.png" - whole path
        
//      Take a screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//        Now copy the screenshot to desired location using copy-file method
        FileUtils.copyFile(src, new File(path + fileName +ext));

    }
}
