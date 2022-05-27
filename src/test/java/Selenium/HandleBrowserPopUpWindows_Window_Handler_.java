package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleBrowserPopUpWindows_Window_Handler_ {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=t-shirt&results=1");
        driver.findElement(By.xpath("//button[normalize-space()='Share']")).click();

        Thread.sleep(2000);

        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();

        String parentWindow_Id = it.next();
        System.out.println("Parent window id: " + "\n" +parentWindow_Id);

        System.out.println("________________________________________");

        String childWindow_Id = it.next();
        System.out.println("Child window id: " + "\n" +childWindow_Id);

        driver.switchTo().window(childWindow_Id);
        System.out.println("________________________________________");
        Thread.sleep(2000);

        System.out.println("Child window pop up: " + "\n" + driver.getTitle());

        driver.close();

        driver.switchTo().window(parentWindow_Id);
        System.out.println("________________________________________");
        Thread.sleep(2000);

        System.out.println("Parent window pop up: " + "\n" + driver.getTitle());

        driver.close();

    }


}
