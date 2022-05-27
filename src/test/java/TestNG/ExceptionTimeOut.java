package TestNG;

import okio.Timeout;
import org.testng.annotations.Test;

public class ExceptionTimeOut {
    @Test(timeOut=250, expectedExceptions = NumberFormatException.class)
    public void infLoop(){
        int i = 1;
        while (i == 1) {
            System.out.println(i);
        }
    }
}
