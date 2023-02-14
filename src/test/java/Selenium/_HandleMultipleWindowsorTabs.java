package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _HandleMultipleWindowsorTabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.yahoo.com/");
        String parent = driver.getWindowHandle();
        System.out.println("Parent windows id is " +parent);
        Set<String> allWindows = driver.getWindowHandles();

        int count = allWindows.size();
        System.out.println("Total windows " +count);

        for (String child: allWindows) {
            if (!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
            }
            System.out.println("Child window title is " +driver.getTitle());

            Thread.sleep(2000);

            driver.close();
//
//        ArrayList<String> tabs = new ArrayList<>(allWindows);
//
//        driver.switchTo().window(tabs.get(0));
//        driver.close();
//
//        driver.switchTo().window(tabs.get(1));
//        driver.close();
//
//        driver.switchTo().window(tabs.get(2));
//        System.out.println("Child window title is " +driver.getTitle());
//
//        driver.close();
        }
    }}
