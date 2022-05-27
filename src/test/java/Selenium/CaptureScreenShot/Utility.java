package Selenium.CaptureScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {

    public static void captureScreenShot(WebDriver driver, String screenshotName) {
        {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source, new File("/Users/dzmitryrazhkou/Desktop/Screenshots" + screenshotName + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Exception while taking screenshot ");

        }
    }
}
