package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowOutOf100WindowsAndValidate {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String URL = "https://opensource-demo.orangehrmlive.com/";   // Parent Window
        String parentWindowId = driver.getWindowHandle();

        driver.get(URL);
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> hList = new ArrayList<String>(handles);
        if (switchToRightWindow("Facebook", hList)) {
            System.out.println(driver.getCurrentUrl() + ": " + driver.getTitle());
        }

        closeAllWindow(hList, parentWindowId);
        switchToParentWindow(parentWindowId);
        System.out.println(driver.getCurrentUrl() + ": " + driver.getTitle());




        }

    public static void closeAllWindow (List<String> hList, String parentWindowId) {
        for (String e: hList) {
            if (!e.equals(parentWindowId)) {
                driver.switchTo().window(e).close();
            }
        }
    }

    public static void switchToParentWindow (String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    public static boolean switchToRightWindow (String windowTitle, List<String> hList) {
        for (String e : hList) {
            String title = driver.switchTo().window(e).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right Window");
                return true;
            }
        }
        return false;
    }

}
