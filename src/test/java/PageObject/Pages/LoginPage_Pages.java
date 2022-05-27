package PageObject.Pages;

import PageObject.Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage_Pages extends BasePage{

    private String url = "https://www.pinterest.com/login/";

    public LoginPage_Pages(WebDriver driver) {
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

    public MainPage_Pages logToWebSite(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage_Pages(driver);

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
