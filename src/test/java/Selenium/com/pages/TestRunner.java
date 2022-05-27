package Selenium.com.pages;

import Selenium.com.pages.com.google.threadclasses.GoogleFeaturesThread;

public class TestRunner {
    public static void main(String[] args) {

//        Thread t1 = new GoogleFeaturesThread("chrome thread", "chrome");
//        Thread t2 = new GoogleFeaturesThread("firefox thread", "firefox");
//
//        System.out.println("Threads started......... ");
//
//        t1.start();
//        t2.start();

        int chromeCount = Integer.parseInt(System.getProperty("chrome"));
        int firefoxCount = Integer.parseInt(System.getProperty("firefox"));

        System.out.println("Total Chrome: " + chromeCount + " and " + "total Firefox: " + firefoxCount);

        for (int i=0, j=0; i<chromeCount || j<firefoxCount; i++, j++) {
            new GoogleFeaturesThread("chrome thread", "chrome").start();
            new GoogleFeaturesThread("firefox thread", "firefox").start();

                    System.out.println("Threads Started......... ");
        }


//        /Users/dzmitryrazhkou/Documents/TestPro/Practise_Automation/src/test/java/Selenium/com/pages

//        Go to Terminal and "mvn compile"

//        mvn exec:java -Dexec.mainClass="com.test.runner.GoogleTestRunner" -Dchrome=2 -Dfirefox=2
    }
}
