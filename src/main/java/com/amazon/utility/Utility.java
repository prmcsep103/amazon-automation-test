package com.amazon.utility;

import com.amazon.drivermanager.ManageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jay
 */
public class Utility extends ManageDriver {

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        try {
            element.click();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(WebElement element) {
        String text = null;
        try {
            text = element.getText();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return text;
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(WebElement element, String str) {
        try {
            element.sendKeys(str);
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    public void sendTextToElement(WebElement element, Keys keys) {
        try {
            element.sendKeys(keys);
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/amazon/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /**
     * Take screenshot in Byte Format
     */
    public static byte[] getScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
