package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {//HomePage is sub class of Util class
    //Create a variable for store xpath value.
    private By _regiserButton = By.xpath("//li/a[contains(@class, \"ico\") and contains(@href,\"reg\")]");
    //Create a variable for store xpath value.
    private By _welcomeMassageOnHomePage = By.xpath("//a[text () = \"Register\"]");
    //Create a variable for store string value.
    String expectedTitleOfThePage = "Register";


    public void verifyUserIsOnHomePage() {
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_welcomeMassageOnHomePage), expectedTitleOfThePage);
    }
    public void clickOnRegisterButton() {
        //wait for 10 second for clickable
        waitUntilElementClickable((_regiserButton), 10);
        //Click the variable
        clickOnElement(_regiserButton);
    }
}







