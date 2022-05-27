package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class elementToBeClickableExpectedCondition {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://phptravels.com/demo");

        String parentWindows = driver.getWindowHandle();

        By g_play = By.xpath("//*[@class='fa fab fa-google']");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600)", "");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement g_play_btn = wait.until(ExpectedConditions.elementToBeClickable(g_play));
        g_play_btn.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowsHandles.iterator();

        while (iterator.hasNext()) {
            String child_window = iterator.next();
            if (!parentWindows.equalsIgnoreCase(child_window)) {
                driver.switchTo().window(child_window);
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps/details?id=com.phptravelsnative");
        System.out.println("Done");

        driver.quit();
    }
}

