package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomExpectedConditions {
    public static void main(String[] args) {

        String testURL = "https://phptravels.com/demo/";
        String testURLTitle = "Demo Script Test drive - PHPTRAVELS";

        String affLinkURL = "https://phptravels.com/affiliate/";
        String affLinkTitle = "Become an Affiliate Partner - PHPTRAVELS";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://phptravels.com/demo/");
    }
}
