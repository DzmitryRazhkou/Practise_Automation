package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HiddenWebElementsRadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        Thread.sleep(500);
        List<WebElement> radio = driver.findElements(By.id("male"));

        int count = radio.size();
        System.out.println("Total radio buttons: " +count);

        for (int i = 0; i < count; i++) {

            WebElement ele = radio.get(i);
            int x = ele.getLocation().getX();

            if (x != 0) {
                ele.click();
                break;
            }
        }

//        driver.quit();
//        driver.close();
    }

}
