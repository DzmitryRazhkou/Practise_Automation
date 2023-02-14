package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import java.util.List;
//
//public class MouseHover {
//    public static boolean main(String[] args) {
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("");
//
////        final By USERS = By.xpath("(//div[@class='figure'])");
////        final By USERS_TXT = By.xpath("(//div[@class='figcaption'])");
////
////        // WEB ELEMENTS:
////
////        // METHODS:
////        public boolean areCaptionsDisplayed(String t) {
////            List<WebElement> figures = driver.findElements(USERS);
////            Actions act = new Actions(driver);
////            boolean displayed = true;
////            //Mouse over in every element
////            //if at least one caption is not displayed, the function will return false
////            for (int i = 1; i <= figures.size(); i++) {
////                WebElement fig = driver.findElement(By.xpath(USERS + "[" + i + "]"));
////                act.moveToElement(fig).perform();
////                WebElement figCap = driver.findElement(By.xpath(USERS_TXT + "[" + i + "]"));
////                if (figCap.isDisplayed() && displayed) {
////                    displayed = figCap.isDisplayed();
////                }
////            }
////            return displayed;
//////        }
////    }
////    }
//}