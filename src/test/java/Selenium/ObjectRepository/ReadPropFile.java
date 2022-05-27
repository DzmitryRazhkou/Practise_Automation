package Selenium.ObjectRepository;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String path = "src/test/java/Selenium/ObjectRepository/config.properties";
        FileInputStream ip = new FileInputStream(path);
        prop.load(ip);

        System.out.println(prop.getProperty("URL"));

        String url = prop.getProperty("URL");
        String browserName = prop.getProperty("browser");
        System.out.println("Browser: " + browserName);

        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        }
        else if (browserName.equals("FF")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
        }
        else if (browserName.equals("Opera")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        }
        driver.get(url);
    }
}
