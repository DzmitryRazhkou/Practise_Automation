package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindBrokenLinksaAndImages {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.manage().window().maximize();   // Maximize Window
        driver.manage().deleteAllCookies();   // Delete All the Cookies

        // Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://humans.net/");   // Enter URL
        System.out.println("Page was Loaded" + "\n_______________");

//        By loginBtnLocator = By.xpath("//*[text()='Log in']");

//        WebElement loginBtn = driver.findElement(loginBtnLocator);
//        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
//        loginBtn.click();

//        driver.switchTo().frame("wee");

//        Links -- //a href <http://www.google.com>
//        images -- //img href <http://www.google.com>


//        1. Get the list of all the links and images;

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Total links are: " +linkList.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();

//        2. Iterate linkList: excluse all the links/images - doesn't have any href
        for (int i = 0; i < linkList.size(); i++) {
            System.out.println((linkList.get(i).getAttribute("href")));
            if (linkList.get(i).getAttribute("href") != null &&
                    (linkList.get(i).getAttribute("href").contains("humans"))) {
                activeLinks.add(linkList.get(i));
            }
        }

//        3. Get size of active links.
        System.out.println("Size of active links is: " +activeLinks.size());

//        4. Check the href url, with http connection API;

//        200 - OK
//        404 - Not Found
//        500 - internal Error
//        400 - Bad Request

        for (int j = 0; j < activeLinks.size(); j++){

        HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
        connection.connect();
        String response = connection.getResponseMessage();   // OK
        connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") +"---> " +response);
            System.out.println("------->>>>>>   <<<<<<<<<---------");

    }
}}
