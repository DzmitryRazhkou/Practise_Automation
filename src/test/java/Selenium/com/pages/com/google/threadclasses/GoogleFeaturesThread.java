package Selenium.com.pages.com.google.threadclasses;

import Selenium.com.pages.GooglePage;

public class GoogleFeaturesThread extends Thread {

    public String browserName;
    GooglePage googlePage;

    public GoogleFeaturesThread (String threadName, String browserName) {
        super(threadName);
        this.browserName = browserName;
        googlePage = new GooglePage();
    }

    @Override
    public void run() {
        System.out.println("Thread -- Started " +Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
            googlePage.setUp(browserName);
            googlePage.googleSearchTest();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            googlePage.TearDown();
        }

        System.out.println("Thread -- Ended " +Thread.currentThread().getName());
    }

}
