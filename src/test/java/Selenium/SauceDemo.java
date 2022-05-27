package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SauceDemo {

    @Test
    public void sauceDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String URL = "https://www.saucedemo.com/";
        driver.get(URL);

        Thread.sleep(1500);

        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));

//        Remove $ from string and turn into double:

        List<Double> beforeFilterPriceList = new ArrayList<>();

        for (WebElement p : beforeFilterPrice) {
            beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

//        Filter the Price from Dropdown:

        Select dd = new Select(driver.findElement(By.className("product_sort_container")));
        dd.selectByVisibleText("Price (low to high)");

//        After filter Capture the Price:

        List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));

//        Remove $ from string and turn into double:

        List<Double> afterFilterPriceList = new ArrayList<>();

        for (WebElement p : afterFilterPrice) {
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));

//        Compare the values/Assert the values (First we need to sort the values of beforeFilterPrice)

            Collections.sort(beforeFilterPriceList);   // It will sort the values in the list
            Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);

            Thread.sleep(2500);
            driver.quit();
        }
    }
}
