package Selenium.NotClickableAtPointException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class YahooCheckChrome {
    public static void main(String[] args) {

//        Not Clickable at Point Exception in Selenium Webdriver (It happens in Safari or Chrome)

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        String locator = "//*[contains(text(),'Stay signed')]";
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();

//        Check.checkById();

//        If it doesn't work, use class Actions

        Actions act = new Actions(driver);
        act.moveToElement((WebElement) By.xpath("//*[contains(text(),'Stay signed')]")).click().build().perform();
    }
}
