package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createBtn.click();
        Thread.sleep(500);

        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement day = driver.findElement(By.name("birthday_day"));
        WebElement year = driver.findElement(By.name("birthday_year"));

        Select select = new Select(month);
        select.selectByIndex(5);

        System.out.println("Is this Drop-Down is Multiple? An answer is: " + select.isMultiple());

        List<WebElement> listOfMonth = select.getOptions();
        System.out.println("Total Months are: " + listOfMonth);

        for (int i = 0; i < listOfMonth.size(); i++) {
//        for (WebElement y : listOfMonth){

            String Months = listOfMonth.get(i).getText();
            System.out.println(Months);

            if (Months.equals("Sep")) {
                listOfMonth.get(i).click();
                break;
            }
        }

//        Check The Size:
        Select monthsSelect = new Select(month);
        List<WebElement> allOptionsEls = monthsSelect.getOptions();
        List<String> allOptions = new ArrayList<>();
        for (WebElement s : allOptionsEls) {
            allOptions.add(s.getText());
        }
        System.out.println(allOptions);

        Set<String> months = new HashSet<>(allOptions);
        Assert.assertEquals(allOptions.size(), months.size());
    }


    //
    public String doDropDownSelect1(String value1, WebElement dropDownMenu) {
        Select dropDown = new Select(dropDownMenu);
        dropDown.selectByValue(value1);
        dropDown.getOptions();

        return dropDown.getFirstSelectedOption().getText();
    }
}
