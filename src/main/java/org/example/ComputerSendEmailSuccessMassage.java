package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerSendEmailSuccessMassage extends Util {//ComputerSendEmailSuccessMassage is sub class of Util class

    //Create a variable for store xpath value.
    private By _emailSendSuccessfully = By.xpath("//div[@class=\"result\"]");
    //Create a variable for store string value.
    String expectEmailSendSuccessfully = "Your message has been sent.";

    public void verifyUserSendEmailAFriendSuccessfully (){
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_emailSendSuccessfully),expectEmailSendSuccessfully,"Email Is Not Sent");
        //sout email send massage
        System.out.println(getTextFromElement(_emailSendSuccessfully));
    }
}


