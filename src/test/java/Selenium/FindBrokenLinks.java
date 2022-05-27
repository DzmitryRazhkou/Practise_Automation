package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBrokenLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));   // total links on the website.
        System.out.println("The amount of links are: " + links.size());

        List<String> urlList = new ArrayList<>();

        for (WebElement e : links) {
            String url = e.getAttribute("href");
            urlList.add(url);
//            checkBrokenLinks(url);
        }

        long stTime = System.currentTimeMillis();
        urlList.parallelStream().forEach(e -> checkBrokenLinks(e));   //
        long endTime = System.currentTimeMillis();

        System.out.println("total time taken: " + (endTime - stTime));

//        parallel - total time: 11146 = 11.1 secs.
//        urlList.parallelStream().forEach(e -> checkBrokenLinks(e));

//        sequence time: 115429 = 115 secs.
//        urlList.stream().forEach(e -> checkBrokenLinks(e));

//        parallel - total time: 11146 = 11.1 secs.



        driver.quit();
    }

    public static void checkBrokenLinks (String linkUrl) {
        try {
            URL url = new URL (linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + " ---> " + httpURLConnection.getResponseMessage()+ "is broken link");
            }

            else {
                System.out.println(linkUrl+ " --->" + httpURLConnection.getResponseMessage());
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
