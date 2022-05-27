package Selenium.NotClickableAtPointException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Check {

    public static void checkById (WebDriver localDriver, String localId) {
        Actions act = new Actions(localDriver);
        act.moveToElement(localDriver.findElement(By.id(localId))).click().build().perform();
    }
}
