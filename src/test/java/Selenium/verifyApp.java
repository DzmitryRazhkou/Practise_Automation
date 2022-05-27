package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyApp {

    @Test

    public void verify(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    String URL = "https://learn-automation.com/";
    driver.get(URL);
//    String title = driver.getTitle();
    String title1 = driver.getPageSource();
        System.out.println("Name is: " +title1);

//        String exp = "Automation - Selenium WebDriver tutorial Step by Step";
//        Assert.assertEquals(title, exp);

        Assert.assertTrue(title1.contains("Automation - Selenium WebDriver"));

}}
