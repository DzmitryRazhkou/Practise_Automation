package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavascriptAlerAndPopUp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");   // Enter URL
        System.out.println("Page was Loaded" + "\n_______________");

        WebElement usernameField = driver.findElement(By.cssSelector("#login1"));
        usernameField.sendKeys("sdrf");

        WebElement loginBtn = driver.findElement(By.name("proceed"));
        loginBtn.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());


        String text = alert.getText();
        if (text.equals("!Please enter your password")) {
            System.out.println("Error message is correct");
        } else {
            System.out.println("In-correct");
        }
        alert.accept();

    }
}
