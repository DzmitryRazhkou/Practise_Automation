package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);

        WebElement createBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createBtn.click();
        Thread.sleep(500);

        Actions act = new Actions(driver);
        driver.findElement(By.name("firstname")).sendKeys("Dzmitry");
        act.sendKeys(Keys.TAB).sendKeys("Razhkou");
        act.sendKeys(Keys.TAB).sendKeys("dimagadjilla@gmail.com");
        act.sendKeys(Keys.TAB).sendKeys("3036057Dr");

        Thread.sleep(1500);
        System.out.println("Completed");
        driver.close();


    }
}

