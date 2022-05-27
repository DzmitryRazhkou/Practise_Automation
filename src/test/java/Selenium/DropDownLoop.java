package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownLoop {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String month_xpath = "//select[@id='month']//option";
        String day_xpath = "//select[@id='day']//option";
        String year_xpath = "//select[@id='year']//option";

        WebElement createBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createBtn.click();
        Thread.sleep(500);

        selectDropDownValue(month_xpath, "May");
        selectDropDownValue(day_xpath, "28");
        selectDropDownValue(year_xpath, "1990");

    }

    public static void selectDropDownValue(String xpathValue, String value) {
        List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
        System.out.println(monthList.size());
        System.out.println("\n________");

        for (int i = 0; i < monthList.size(); i++) {
            System.out.println(monthList.get(i).getText());
            if (monthList.get(i).getText().equals(value)) {
                monthList.get(i).click();
                break;
            }
        }
    }
}
