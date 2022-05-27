package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignatureAutomation {

    @Test
    public static void signature() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String URL = "https://www.signwell.com/online-signature/draw/";
        driver.get(URL);

        Thread.sleep(1500);

        WebElement signatureCanvas = driver.findElement(By.id("canvas_signature"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(signatureCanvas, 200, 0).build().perform();

        Thread.sleep(1500);
        driver.quit();

    }
}
