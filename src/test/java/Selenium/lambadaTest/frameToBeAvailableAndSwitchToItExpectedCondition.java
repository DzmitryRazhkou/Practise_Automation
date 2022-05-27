package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class frameToBeAvailableAndSwitchToItExpectedCondition {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://jqueryui.com/spinner/");
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)", "");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        By frame_locator = By.xpath("//*[@class='demo-frame']");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame_locator));

        By elem_set_value = By.xpath("//*[contains(text(),'Get value')]");
        wait.until(ExpectedConditions.presenceOfElementLocated(elem_set_value));

        driver.quit();



    }
}
