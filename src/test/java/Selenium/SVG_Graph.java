package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SVG_Graph {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String URL = "https://www.google.com/search?q=covid+statistics+california&rlz=1C5CHFA" +
                "_enUS975US975&oq=covid+sta&aqs=chrome.6" +
                ".0i131i433i457i512j69i57j0i402l2j0i131i433i512j0i433i512j0i512j0i433i512j0i131i433j0i10i512" +
                ".10874j0j7&sourceid=chrome&ie=UTF-8";

        driver.get(URL);   // Enter URL

        List<WebElement> graphList = driver.findElements(By.xpath("(//*[@class='uch-svg'])[1]//*[name()='line']"));
        Actions act = new Actions(driver);
        for (WebElement e : graphList){
            act.moveToElement(e).perform();

            String data = driver.findElement(By.xpath("//*[@class='ExnoTd']")).getText();
            System.out.println(data);
        }
    }
}
