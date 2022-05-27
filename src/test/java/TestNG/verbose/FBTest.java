package TestNG.verbose;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void FBTitleTest() {
        String title = driver.getTitle();
        String actual = "Facebook - Log In or Sign Up";
        System.out.println("Title of the website is: " + title);
        Assert.assertEquals(title, actual);
    }

    @Test
    public void FBTitleTest1() {
        String title = driver.getTitle();
        String actual = "Facebook - Log In or Sign Up";
        System.out.println("Title of the website is: " + title);
        Assert.assertEquals(title, actual);
    }

    @Test
    public void FBTitleTest2() {
        String title = driver.getTitle();
        String actual = "Facebook - Log In or Sign Up";
        System.out.println("Title of the website is: " + title);
        Assert.assertEquals(title, actual);
    }

    @AfterMethod
        public void tearDown(){
        driver.quit();
    }
}
