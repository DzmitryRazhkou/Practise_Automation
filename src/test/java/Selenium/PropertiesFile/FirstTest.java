package Selenium.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FirstTest {

    @Test
    public void OpenBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = PropertyFileUtils.loadApplicationProperties().getProperty("app_url");
        driver.get(url);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Google"), "Page title isn't correct");
        driver.quit();
    }
}
