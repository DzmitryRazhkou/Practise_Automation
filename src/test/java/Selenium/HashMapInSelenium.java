package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class HashMapInSelenium {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String URL = "https://classic.freecrm.com/index.html";
        driver.get(URL);

        System.out.println(getCredentials());
        System.out.println(getCredentials().get("Customer"));

        String credential_customer = getCredentials().get("Customer");
        driver.findElement(By.name("username")).sendKeys(getUserName("seller"));
        driver.findElement(By.name("password")).sendKeys(getPassword("admin"));

    }

    public static HashMap<String, String> getCredentials() {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Customer", "gansRazhkou:Test3036057Dr");
        userMap.put("admin", "aspit:34855");
        userMap.put("seller", "korina:3345986");
        userMap.put("deliveryGuy", "455566:hui");

        return userMap;
    }

    public static String getUserName (String role) {
        String credentials = getCredentials().get(role);
        return credentials.split(":")[0];
    }

    public static String getPassword (String role) {
        String credentials = getCredentials().get(role);
        return credentials.split(":")[1];
}}
