import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookHandleWindows {
    public static void main(String[] args) throws InterruptedException {

        String path = System.getProperty("user.dir") + "/src/test/java/LetMeTry.java";

//        /Users/dzmitryrazhkou/Documents/TestPro/Practise_Automation/src/test/java/LetMeTry.java - Total path!!!!!!!

//        "user.dir" - /Users/dzmitryrazhkou/Documents/TestPro/Practise_Automation
//        "te rest" - /src/test/java/LetMeTry.java

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=t-shirt&results=1");
        driver.findElement(By.xpath("//*[@class='icon-facebook']")).click();

        Thread.sleep(2000);

        Set<String> pages = driver.getWindowHandles();
        Iterator<String> it = pages.iterator();

        String parentWindow_Id = it.next();
        System.out.println("Parent window id: " + "\n" +parentWindow_Id);

        String childWindow_Id = it.next();
        System.out.println("Child window id: " + "\n" +childWindow_Id);
        if (!parentWindow_Id.equalsIgnoreCase(childWindow_Id)) {
            driver.switchTo().window(childWindow_Id);
        }

        String pageName = driver.getTitle();
        System.out.println("________________________________________");

        String actualPage = "Facebook";
        Assert.assertEquals(pageName, actualPage);


        Thread.sleep(2000);
        System.out.println("Test completed");
        driver.close();

        driver.switchTo().window(parentWindow_Id);
        driver.close();
    }
}
