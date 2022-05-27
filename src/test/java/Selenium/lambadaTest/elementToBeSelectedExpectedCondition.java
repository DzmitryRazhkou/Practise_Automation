package Selenium.lambadaTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementToBeSelectedExpectedCondition {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://lambdatest.github.io/sample-todo-app/");

        WebElement elem_li1 = driver.findElement(By.name("li1"));
        WebElement elem_li2 = driver.findElement(By.name("li2"));

        elem_li1.click();
//        Thread.sleep(2000);

        elem_li2.click();
//        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.elementToBeSelected(elem_li1));
        wait.until(ExpectedConditions.elementToBeSelected(By.name("li2")));

        try {
            /* wait for the element li3 to be selected */
            wait.until(ExpectedConditions.elementToBeSelected(By.name("li3")));
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("Pass - Elem li3 is not selected");
        }

        if(driver != null) {
            driver.quit();
        }
    }
}
