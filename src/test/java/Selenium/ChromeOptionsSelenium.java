package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeOptionsSelenium {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setAcceptInsecureCerts(true);

//        opt.addExtensions(new File("/Users/dzmitryrazhkou/Desktop/Ar.crx"));

        opt.addArguments("--disable-infobars");
        opt.setAcceptInsecureCerts(true);
        opt.merge(cap);

//        For Headless Mode

//        opt.addArguments("--headless");
//        opt.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.yahoo.com/");

        System.out.println("______ Done ______");
    }
}
