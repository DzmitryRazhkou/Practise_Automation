package Selenium;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class OCRTesseract {
    public static void main(String[] args) {

        ITesseract image = new Tesseract();
        try
        {
            String str = image.doOCR(new File("/Users/dzmitryrazhkou/Desktop/img.png"));
            System.out.println("Data from image is " +str);

        } catch (TesseractException e) {
            e.printStackTrace();
            System.out.println("Exception " +e.getMessage());
        }
    }
}
