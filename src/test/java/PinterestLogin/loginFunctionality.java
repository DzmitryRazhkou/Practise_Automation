package PinterestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginFunctionality {
    private WebDriver driver;
    private WebDriverWait wait;
    private String email = "dimagadjilla@gmail.com";
    private String valid_password = "ab2941117";
    private String wrong_password = "1234";

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 100);
        String url = "https://www.pinterest.com/login/";
        driver.get(url);
    }

    @AfterMethod
    public void TearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void loginWithValidCredentials() {
        By emailField = By.xpath("//*[@placeholder='Email']");
        By passwordField = By.xpath("//*[@placeholder='Password']");
        By loginBtn = By.xpath("//*[text()='Log in']");
        By pinLogo = By.xpath("(//*[@role='img'])[1]");

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(valid_password);
        driver.findElement(loginBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinLogo));

        Assert.assertTrue(driver.findElement(pinLogo).isDisplayed());
    }

    @Test
    public void loginWithWrongCredentials() {
        By emailField = By.xpath("//*[@placeholder='Email']");
        By passwordField = By.xpath("//*[@placeholder='Password']");
        By loginBtn = By.xpath("//*[text()='Log in']");
        By errorMessage = By.xpath("//*[@id='password-error']");

        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(wrong_password);
        driver.findElement(loginBtn).click();

        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed());

    }

    @Test
    public void loginWithWrongCredentials_customWait() throws InterruptedException {
        By emailField = By.xpath("//*[@placeholder='Email']");
        By passwordField = By.xpath("//*[@placeholder='Password']");
        By loginBtn = By.xpath("//*[text()='Log in']");
        By errorMessage = By.xpath("//*[@id='password-error']");

        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(wrong_password);
        driver.findElement(loginBtn).click();

//      Custom Wait

        for (int i = 0; i < 100; i++) {
            try {
                driver.findElement(errorMessage);
                break;
            } catch (NoSuchElementException yy) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException Ignore) {

                }
            }
        }

        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed());
    }
}
