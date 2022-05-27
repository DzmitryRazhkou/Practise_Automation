package Selenium.OTP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonOTPHandle {

    public static final String Account_SID = "AC499646da5ce0877bb4cb11dfb540103f";
    public static final String Auth_Token = "17c7257eb03603ea2071946e30d1d8dd";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://www.amazon.com/");

        WebElement hello_SignIn = driver.findElement(By.cssSelector("#nav-link-accountList"));

        Actions act = new Actions(driver);
        act.moveToElement(hello_SignIn).click();
        Thread.sleep(500);

        driver.findElement(By.linkText("Start here.")).click();

        driver.findElement(By.id("ap_customer_name")).sendKeys("Dzmitry Razhkou");
        driver.findElement(By.id("ap_email")).sendKeys("+17752577956");

        driver.findElement(By.id("ap_password")).sendKeys("3036057");
        driver.findElement(By.id("ap_password_check")).sendKeys("3036057");

        driver.findElement(By.id("continue")).click();

        WebElement puzzle = driver.findElement(By.xpath("//*[@id='home_children_button']"));

        wait.until(ExpectedConditions.visibilityOf(puzzle)).click();


//        act.moveToElement(puzzle).click().build().perform();
//        Thread.sleep(1500);

        System.out.println("\nPassed");

    }
}
