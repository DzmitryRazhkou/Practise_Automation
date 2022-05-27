package PO.Pages_PO;

import PageObject.Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage_Pages_PO extends BasePage_PO {

    private String url = "https://www.pinterest.com/login/";
    private static String txtEmail = "//*[@placeholder='Email']";
    private static String txtPassword = "//*[@placeholder='Password']";
    private static String btnLogIn = "//*[text()='Log in']";


    public LoginPage_Pages_PO(WebDriver driver) {
        super(driver);

    }

    private WebElement getEmailField() {
        By emailField = Locators.emailLocator;
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        return driver.findElement(emailField);
    }

    private WebElement getPasswordField() {
        By passwordField = Locators.passwordLocator;
        return driver.findElement(passwordField);
    }

    private WebElement getLoginButton() {
        By loginButton = Locators.loginBtnLocator;
        return driver.findElement(loginButton);
    }

    public void open() {
        driver.get(url);
    }

    public MainPage_Pages_PO logToWebSite(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage_Pages_PO(driver);

    }

    private WebElement getErrorMessage() {
        By error = Locators.errorBtnLocator;
        wait.until(ExpectedConditions.visibilityOfElementLocated(error));
        return driver.findElement(error);
    }


    public boolean isError() {
        try {
            return getErrorMessage().isDisplayed();
        } catch (TimeoutException err) {
            return false;
        }

    }
}
