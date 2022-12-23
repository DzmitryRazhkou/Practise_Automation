package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;

public class DisableImages {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions options = new FirefoxOptions();
//        disableImagesFirefox(options);
//        WebDriver driver = new FirefoxDriver(options);

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        disableImageChrome(options);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.yahoo.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        driver.quit();
    }

    public static void disableImageChrome(ChromeOptions options){
        HashMap<String, Object> images = new HashMap<>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
    }

    public static void disableImagesFirefox(FirefoxOptions options){
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("permissions.default.image", 2);
        options.setProfile(profile);
        options.setCapability(FirefoxDriver.PROFILE, profile);
    }
}
