package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TeslaTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.tesla.com/");
    }

    @Test (priority = 1)
    public void TeslaTest() {
        String title = driver.getTitle();
        System.out.println("The Header of Website is: " + title);
        Assert.assertEquals(title, "Electric Cars, Solar & Clean Energy | Tesla");
    }

    @Test (priority = 2, enabled = false)
    public void LogoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@class='tds-icon tds-icon-logo-wordmark tds-site-logo-icon']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
