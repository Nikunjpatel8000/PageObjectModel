package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static void selectFromDropDownByValu(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }
    //Reusable method to timeStamp use for print current time
    public static long timeStamp() {
        return (System.currentTimeMillis());
    }
    //Reusable method to getCurrentUrl use for Assert by URl
    public static Boolean getCurrentUrl(String Url){
        return driver.getCurrentUrl().contains(Url);
    }
}

