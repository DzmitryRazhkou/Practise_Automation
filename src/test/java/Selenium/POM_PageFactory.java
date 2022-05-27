package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PageFactory {

    public static WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'FEEDBACK')]")
    private WebElement feedbackBtn;

    @FindBy(name = "downloadInvoice")
    private WebElement downloadBtn;

    public POM_PageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void feedBack() {
        feedbackBtn.click();
    }

    public void setDownloadInvoice() {
        downloadBtn.click();
    }
}
