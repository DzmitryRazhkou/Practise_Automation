package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleFewWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.pinterest.com/");
        WebElement login = dr.findElement(By.xpath("(//div[@class='Eqh KS5 hs0 un8 C9i TB_']/div)[2]"));
        login.click();

        Thread.sleep(2000);

        Set<String> handler = dr.getWindowHandles();

        Iterator<String> it = handler.iterator();

        String parentWindowId = it.next();
        System.out.println("Parent Window id: " +parentWindowId);

        String childWindowId = it.next();
        System.out.println("Child Window id: " +childWindowId);

        dr.switchTo().window(childWindowId);
        Thread.sleep(2000);
        System.out.println("Child Window Pop Up " +dr.getTitle());
        dr.close();

        dr.switchTo().window(parentWindowId);
        Thread.sleep(2000);
        System.out.println("Parent Window Pop Up "+dr.getTitle());

    }
}
