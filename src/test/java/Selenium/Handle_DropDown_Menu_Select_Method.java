package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handle_DropDown_Menu_Select_Method {
    @Test
    public void DropDown_Menu() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement createBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createBtn.click();
        Thread.sleep(500);

        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement day = driver.findElement(By.name("birthday_day"));
        WebElement year = driver.findElement(By.name("birthday_year"));

        selectValuesFromDropDownMenu(month, "May");
        selectValuesFromDropDownMenu(day,"28");
        selectValuesFromDropDownMenu(year, "1990");

//        String dob = "05-28-1990";
//        String[]arr = dob.split("-");

//        selectValuesFromDropDownMenu(month, arr[0]);
//        selectValuesFromDropDownMenu(day,arr[1]);
//        selectValuesFromDropDownMenu(year, arr[2]);

    }
        public static void selectValuesFromDropDownMenu(WebElement element, String value){
            Select select = new Select(element);
            select.selectByVisibleText(value);
            System.out.println(select.isMultiple());

        }



}
