package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaleElementExceptionConcept_POM_PF {

    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://live.skillrary.com/testing-app/");   // Enter URL

        POM_PageFactory pf = new POM_PageFactory(driver);
        pf.feedBack();
        pf.setDownloadInvoice();

        driver.navigate().refresh();

        pf.feedBack();
        pf.setDownloadInvoice();

        
//        How To Overcome Stale Element Reference Exception in Selenium:
//        1: Refreshing the web page.
//        2: Using Try Catch Block.
//        3: Using ExpectedConditions. refreshed.
//        4: Using POM.


        //        Try/ catch block:

//        public boolean isElementPresent(By by) {
//            boolean isPresent = true;
//            try {
//                driver.findElement(by);
//            } catch (NoSuchElementException e) {
//                isPresent = false;
//            }
//            return isPresent
//        }



//        public WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec) {
//
//            FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(timoutSec, TimeUnit.SECONDS)
//                    .pollingEvery(pollingSec, TimeUnit.SECONDS)
//                    .ignoring(NoSuchElementException.class, TimeoutException.class);
//
//            for (int i = 0; i < 2; i++) {
//                try {
//                    //fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We are processing through trillions of data events, this insight may take more than 15 minutes to complete.']")));
//                    fWait.until(ExpectedConditions.visibilityOf(element));
//                    fWait.until(ExpectedConditions.elementToBeClickable(element));
//                }
//                catch (Exception e) {
//
//                    System.out.println("Element Not found trying again - " + element.toString().substring(70));
//                    e.printStackTrace();
//                }
//            }
//
//            return element;
//        }



//        // Waiting 30 seconds for an element to be present on the page, checking
//        // for its presence once every 5 seconds.
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(30, SECONDS)
//                .pollingEvery(5, SECONDS)
//                .ignoring(NoSuchElementException.class);
//
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("foo"));
//            }
//        });






    }
}
