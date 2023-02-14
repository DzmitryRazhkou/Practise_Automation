package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PopUpAlertClass {
    public static void main(String[] args) {
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " +alert.getText());
        alert.accept();
    }
}
