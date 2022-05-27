package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class textToBePresentInElementLocated {
    public static void main(String[] args) {

        String stText = "laudantium";
        Integer counter = 1;
        Boolean bTextPresent = false;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/dynamic_content?with_content=static.");

        By elem_dynamic_con_locator = By.cssSelector("#content.large-10 > div:nth-of-type(3) > .large-10");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        while (!bTextPresent) {
            try {
                System.out.println(driver.findElement(elem_dynamic_con_locator).getText());
                bTextPresent = wait.until(ExpectedConditions.textToBePresentInElementLocated(elem_dynamic_con_locator, stText));
                if (bTextPresent) {
                    System.out.println("The text " + stText + " is present");
                    break;
                }
            } catch (TimeoutException e) {
                /* e.printStackTrace(); */
                counter++;
                System.out.println("Presence: " + bTextPresent + " Counter " + counter);
                driver.navigate().refresh();
                continue;
            }
        }
        System.out.println("ExpectedConditions.textToBePresentInElement successful with text " + stText + " found after " + counter + " attempts\n");

        driver.quit();
    }
}
