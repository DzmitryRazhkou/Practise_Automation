package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemoClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://login.yahoo.com/";
        driver.get(url);
        driver.findElement(By.cssSelector("#login-username")).sendKeys("dzmitryrazhkou@gmail.com");
        Thread.sleep(2500);

//      1. Method
//      Go to Inspect -> Console -> and put "document.getElementById('persistent')"

        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("document.getElementById('persistent').click()");

//        2. Method

        WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]"));
        js.executeScript("arguments[0].click()", checkbox);

//        js.executeScript("alert('Welcome to Selenium')");

        System.out.println("Javascript was Performed");

        driver.quit();
//        driver.close();

    }
}
