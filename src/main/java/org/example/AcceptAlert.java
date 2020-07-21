package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AcceptAlert extends Util {//AcceptAlert is sub class of Util class

    //Create a variable for store xpath value.
    private By _clickOnSearchButton = By.xpath("//input[starts-with(@type, \"sub\")]");

    public void userAcceptAlert() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnSearchButton, 10);
        //Click the variable
        clickOnElement(_clickOnSearchButton);
        //getText from alert message
        String alertMessage = driver.switchTo().alert().getText();
        //String value store
        String expectAlertMessage = "Please enter some search keyword";
        //Assert equals of messages
        Assert.assertEquals(alertMessage, expectAlertMessage, "Massage Is Not Match");
        //sout message
        System.out.println(expectAlertMessage);
        //alert message accept
        driver.switchTo().alert().accept();

    }
}


