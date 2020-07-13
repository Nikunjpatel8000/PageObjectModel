package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util {//RegisterSuccessPage is sub class of Util class
    //Create a variable for store xpath value.
    private By _registerSuccessMassage = By.xpath("//div[text () =\"Your registration completed\"]");
    //Create a variable for store string value.
    String expectRegisterSuccessMassage = "Your registration completed";

    public void verifyUserRegistrationSuccessfully() {
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_registerSuccessMassage), expectRegisterSuccessMassage, "Your Registration Not Completed");
        //sout get text value
        System.out.println(getTextFromElement(_registerSuccessMassage));
    }
}



