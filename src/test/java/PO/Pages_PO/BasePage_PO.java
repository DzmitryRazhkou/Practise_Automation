package PO.Pages_PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage_PO {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage_PO(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }
}
