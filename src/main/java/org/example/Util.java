package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {//Util is sub class of BasePage class

    //Reusable method for Thread.sleep
    public static void sleep(int a) {
        try {
            Thread.sleep(a * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Reusable method to click On Element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method to get text from the element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Reusable method to wait until element is clickable
    public static void waitUntilElementClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //Reusable method to typeText from text box
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method to //Reusable method to wait until element is visible
    public static void waitUntilElementToBeVisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    //Reusable method to select from dropDown is visible
    public static void selectFromDropDownByVisibleText(By by, String text) {
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    //Reusable method to select from dropDown is index
    public static void selectFromDropDownByIndex(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    //Reusable method to select from dropDown is value
    public static void selectFromDropDownByValue(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    //Reusable method to timeStamp use for print current time
    public static long timeStamp() {
        return (System.currentTimeMillis());
    }

    //Reusable method to getCurrentUrl use for Assert by URl
    public static Boolean getCurrentUrl(String Url) {
        return driver.getCurrentUrl().contains(Url);
    }

    public void takeScreenShot(String methodName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {//set path for screen shot store
            FileUtils.copyFile(scrFile, new File("src\\ScreenShots\\" + methodName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   //Reusable method for switch to driver
    public static void driverSwitch(String id)
    {
        driver.switchTo().frame(id);
    }
    //Reusable method for switch to driver back window
    public static void switchParent()
    {
        driver.switchTo().parentFrame();
    }
}

