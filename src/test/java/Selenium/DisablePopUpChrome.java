package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class DisablePopUpChrome {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        // Remove sign "Thus application is being under automation"

//        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        // Block all pop-ups windows while a website is loading

        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://charter97.org/");
    }
}
