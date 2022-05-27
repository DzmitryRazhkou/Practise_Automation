package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleTrickyiFrameShadowRootWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://selectorshub.com/xpath-practice-page/");

//        How to find JS element:
//        1. Open inspect ---> find element ---> copy JS path
//        ---> proceed from Element Tab to Console Tab and insert path
//
//        ele = document.querySelector("#snacktime").shadowRoot.querySelector("#tea");
//        ele.setAttribute('value', 'Green Tea');  ----> we will see the text inside text-box.

        driver.switchTo().frame("pact");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement element = (WebElement)
                jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
        String js = "arguments[0].setAttribute('value', 'British Tea')";
        jse.executeScript(js, element);

        System.out.println("---->>> Done <<<------");

    }
}
