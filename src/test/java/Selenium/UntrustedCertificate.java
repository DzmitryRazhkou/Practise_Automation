package Selenium;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UntrustedCertificate {

    @Test
    public void handleCertificate() throws InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);
        co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        co.merge(cap);

        WebDriver driver = new ChromeDriver(co);
        driver.get("http://www.cacert.org");
        System.out.println(driver.getTitle());

        Thread.sleep(2500);

        driver.quit();
        driver.close();

    }
}
