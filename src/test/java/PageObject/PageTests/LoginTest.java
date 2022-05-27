package PageObject.PageTests;

import PageObject.Pages.LoginPage_Pages;
import PageObject.Pages.MainPage_Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginToWeb_CorrectCredentials() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        MainPage_Pages mainPage = loginPage.logToWebSite(email, valid_password);

        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void LoginToWeb_IncorrectCredentials() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        loginPage.logToWebSite(email, wrong_password);

        Assert.assertTrue(loginPage.isError());
    }

    @Test
    public void LoginToWeb_CorrectCredentials_1() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        MainPage_Pages mainPage = loginPage.logToWebSite(email, valid_password);

        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void LoginToWeb_IncorrectCredentials_1() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        loginPage.logToWebSite(email, wrong_password);

        Assert.assertTrue(loginPage.isError());
    }

    @Test
    public void LoginToWeb_CorrectCredentials_2() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        MainPage_Pages mainPage = loginPage.logToWebSite(email, valid_password);

        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void LoginToWeb_IncorrectCredentials_2() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        loginPage.logToWebSite(email, wrong_password);

        Assert.assertTrue(loginPage.isError());
    }

    @Test
    public void LoginToWeb_CorrectCredentials_3() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        MainPage_Pages mainPage = loginPage.logToWebSite(email, valid_password);

        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void LoginToWeb_IncorrectCredentials_3() {
        LoginPage_Pages loginPage = new LoginPage_Pages(driver);
        loginPage.open();
        loginPage.logToWebSite(email, wrong_password);

        Assert.assertTrue(loginPage.isError());
    }
}



