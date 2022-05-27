package PO.Test_PO;

import PO.Pages_PO.LoginPage_Pages_PO;
import PO.Pages_PO.MainPage_Pages_PO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_PO extends BaseTest_PO {

    @Test
    public void LoginToWeb_CorrectCredentials() {
        LoginPage_Pages_PO loginPage_pages_po = new LoginPage_Pages_PO(driver);
        loginPage_pages_po.open();
        MainPage_Pages_PO mainPage_pages_po = loginPage_pages_po.logToWebSite(email, valid_password);

        Assert.assertTrue(mainPage_pages_po.isMainPage());
    }

    @Test
    public void LoginToWeb_IncorrectCredentials() {
        LoginPage_Pages_PO loginPage_pages_po = new LoginPage_Pages_PO(driver);
        loginPage_pages_po.open();
        loginPage_pages_po.logToWebSite(email, wrong_password);

        Assert.assertTrue(loginPage_pages_po.isError());
    }

    }




