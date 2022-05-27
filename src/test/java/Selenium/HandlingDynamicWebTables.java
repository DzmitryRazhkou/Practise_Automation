package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDynamicWebTables {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");   // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();   // Launch A Google Chrome

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("https://money.rediff.com/companies/Utique-Enterprises-Ltd/14070001?query=Apple");   // Enter URL

        WebElement webTable = driver.findElement(By.className("company-graph-wrap"));
        webTable.click();

        List<WebElement> column = driver.findElements(By.xpath("(//tr)[1]"));
        int columnCount = column.size();
        for (int i = 0; i < columnCount; i++){
            System.out.print("list of Columns: " + "\n" + column.get(i).getText());

            List<WebElement> row = driver.findElements(By.xpath("(//tr)[2]"));
            int rowCount = row.size();
            for (int j = 0; j < rowCount; j++){
                System.out.println("List of row: " + "\n" + row.get(j).getText());
            }
        }


    }
}
