package Selenium.ShadowDOM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDOMDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        By locator = By.id("userPass");
        driver.findElement(locator).click();
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("Veggie Plain-Based").perform();


    }

}
