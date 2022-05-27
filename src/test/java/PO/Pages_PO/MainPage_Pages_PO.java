package PO.Pages_PO;

import PO.Pages_PO.BasePage_PO;
import PageObject.Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage_Pages_PO extends BasePage_PO {

    public MainPage_Pages_PO(WebDriver driver) {
        super(driver);
    }

    private WebElement getMainBtn() {
        By mainBtnField = Locators.mainBtnLocator;
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainBtnField));
        return driver.findElement(mainBtnField);
    }

    public boolean isMainPage() {
        try {
            return getMainBtn().isDisplayed();
        } catch (TimeoutException mistake) {
            return false;
        }
    }

}
