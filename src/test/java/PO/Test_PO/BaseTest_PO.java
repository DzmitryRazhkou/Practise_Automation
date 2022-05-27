package PO.Test_PO;

import PageObject.Helper.BrowserFabric;
import PageObject.Helper.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_PO {

    protected WebDriver driver;
    protected String email = "dimagadjilla@gmail.com";
    protected String valid_password = "ab2941117";
    protected String wrong_password = "1234";

    @BeforeMethod
    public void startUp() {

//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriverManager.operadriver().setup();

        driver = BrowserFabric.get(BrowserType.CHROME);
    }

    @AfterMethod
    public void TearDown() {
        driver.close();
        driver.quit();
    }
}
