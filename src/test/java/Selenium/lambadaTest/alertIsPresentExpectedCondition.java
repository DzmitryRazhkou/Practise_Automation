package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertIsPresentExpectedCondition {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new SafariDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement elem_alert_btn = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]"));
        elem_alert_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert bAlertPresent = wait.until(ExpectedConditions.alertIsPresent());
        bAlertPresent.accept();

        System.out.println("Demo of ExpectedConditions.alertIsPresent successful");

        driver.quit();

    }
}
