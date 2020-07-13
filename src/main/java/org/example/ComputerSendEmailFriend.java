package org.example;

import org.openqa.selenium.By;

public class ComputerSendEmailFriend extends Util {//ComputerSendEmailFriend is sub class of Util class
    //Create a variable for store xpath value.
    private By _typeFriendEmail = By.xpath("//div[@class=\"fieldset\"]/div[1]/div[1]/input");
    //Create a variable for store xpath value.
    private By _typeFriendMessasge = By.xpath("//textarea[@class=\"your-email\"]");
    //Create a variable for store xpath value.
    private By _clickOnEmailSendButton = By.xpath("//input[@value=\"Send email\"]");

    public void enterDatailsOfFriend() {
        sleep(3);//sleep for 3 sec
        typeText(_typeFriendEmail,"testing+"+timeStamp()+"@gmail.com");
        typeText(_typeFriendMessasge,"Your favourite products are 50% Off !!!");

    }
    public void clickOnEmailSendButton() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnEmailSendButton, 10);
        //Click the variable
        clickOnElement(_clickOnEmailSendButton);
    }

}







