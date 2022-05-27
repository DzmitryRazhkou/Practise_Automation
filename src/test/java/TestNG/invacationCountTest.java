package TestNG;

import org.testng.annotations.Test;

public class invacationCountTest {

    @Test (invocationCount = 5)
    public void sum() {
        int a = 15;
        int b = 31;
        int c = a + b;

        System.out.println("Sum is: " +c);
    }
}
