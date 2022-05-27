package SimpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.*;

public class Yahoo {

    static WebDriver driver;
    static WebDriverWait wait;
    final static String search = "War in Ukraine";
    final static String speech = "President Zelensky predicts troubles for NATO member states if Russia seizes control of Ukraine";

    @BeforeMethod
    public void Launch() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        wait = new WebDriverWait(driver, 20);
        driver.get("https://www.yahoo.com/");
        System.out.println(driver.getTitle());
        System.out.println("_______________");
//        System.out.println(driver.getPageSource());
    }

    @Test
    public void verifyTest() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ybar-sbq']"))).sendKeys(search);
        driver.findElement(By.xpath("//*[@id='ybar-search']")).click();
        WebElement post = new WebDriverWait(driver, 5).until(driver->
                driver.findElement(By.xpath("//*[contains(text(),'President Zelensky')]")));

        Assert.assertTrue(speech.contains(post.getText()));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
