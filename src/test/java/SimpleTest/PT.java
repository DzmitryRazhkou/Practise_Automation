package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PT {
    @Test
    public void searchPolinaShapoval() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement searchFiled = driver.findElement(By.xpath("//*[@title='Search']"));
        searchFiled.sendKeys("Polina Shapoval");
        Thread.sleep(2500);
        searchFiled.sendKeys(Keys.RETURN);

        WebElement link = driver.findElement(By.xpath("//*[text()='Polina Shapoval']"));
        String result = link.getText();
        Thread.sleep(2500);

        Assert.assertEquals("Polina Shapoval", result);
        Thread.sleep(3500);
        driver.close();
        driver.quit();




    }
}
