package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class DifferentCracterEnteringSendKeys {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String URL = "https://www.google.com/";


        driver.get(URL);   // Enter URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.xpath("//input[@title='Search']"));

//        1. String:
//        email.sendKeys("Username");

//        2. StringBuilder
//        StringBuilder username = new StringBuilder()
//                .append("Dzmitry")
//                .append(" ")
//                .append("Razhkou")
//                .append(" ")
//                .append("Selenium")
//                .append(" ")
//                .append("Automatiom");
//        email.sendKeys(username);

        //        3. StringBuffer
        StringBuffer username = new StringBuffer()
                .append("Dzmitry")
                .append(" ")
                .append("Razhkou")
                .append(" ")
                .append("Selenium")
                .append(" ")
                .append("Automatiom");
        email.sendKeys(username);
    }
}

