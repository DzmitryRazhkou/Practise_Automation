package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithoutSendKeysJS {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);

        WebElement createBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createBtn.click();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement email = driver.findElement(By.name("firstname"));
        js.executeScript("arguments[0].value=arguments[1]", email, "Dzmitry");
        Thread.sleep(250);
        WebElement lastname = driver.findElement(By.name("lastname"));
        js.executeScript("arguments[0].value=arguments[1]", lastname, "Razhkou");
        Thread.sleep(250);
        System.out.println("Test is Completed");
        driver.close();
        driver.quit();
    }
}
