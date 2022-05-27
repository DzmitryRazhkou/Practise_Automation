package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandlePagination_2 {

    @Test
    public void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://datatables.net/examples/advanced_init/dt_events.html";
        driver.get(url);

        List<WebElement> namesElements = driver.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));
        List<String> names = new ArrayList<>();

        for (WebElement n : namesElements) {
            names.add(n.getText());
        }

        String nextButtonName = driver.findElement(By.id("example_next")).getAttribute("class");

        while (!nextButtonName.contains("disables")) {

            driver.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));
            names = new ArrayList<>();

            for (WebElement n : namesElements) {
                names.add(n.getText());
            }
            nextButtonName = driver.findElement(By.id("example_next")).getAttribute("class");
        }
        names.forEach(e->System.out.println(e));

        int totalNames = names.size();
        System.out.println("Total number of Names: " +totalNames);

        String displayedCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
        Assert.assertEquals(displayedCount, String.valueOf(totalNames));

        Thread.sleep(2500);
        driver.quit();

    }
}

