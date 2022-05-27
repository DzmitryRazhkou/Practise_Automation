package TestNG.screenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class ScreenshotTest extends Base{

    @BeforeMethod
    public void launch() {
        initialization();

    }

    @Test
    public void takeScreenshot() {
        Assert.assertEquals(true, false);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
