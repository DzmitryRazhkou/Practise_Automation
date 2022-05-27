package PageObject.Pages;

import PageObject.Locators.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage_Pages extends BasePage{

    public MainPage_Pages(WebDriver driver) {
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
