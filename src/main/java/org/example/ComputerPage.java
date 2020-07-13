package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage  extends Util{//ComputerPage is sub class of Util class
    //Create a variable for store xpath value.
    private By _welcomeMsgComputerPage = By.xpath("//div[@class=\"page-title\"]/h1");
    //Create a variable for store string value.
    String ecpectWelcomeMsgComputerPage = "Computers";
    //Create a variable for store xpath value.
    private By _clickOnDesktops = By.xpath("//ul[@class=\"sublist\"]/li/a[@href=\"/desktops\"]");
    //Create a variable for store xpath value.
    private By _clickDigitalStrom = By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/h2/a");
    //Create a variable for store xpath value.
    private By _clickOnEmail = By.xpath("//input[@value=\"Email a friend\"]");

    public void verifyUserIsOnComputerPage() {
        //assert equals for expect and actual result
      Assert.assertEquals(getTextFromElement(_welcomeMsgComputerPage),ecpectWelcomeMsgComputerPage,"User Is Not Computer Page");

    }
    public void clickOnDesktopsCategory() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnDesktops, 10);
        //Click the variable
        clickOnElement(_clickOnDesktops);
    }
    public void clickOnDigitalProduct() {
        //wait for 20 second for variable
        waitUntilElementClickable(_clickDigitalStrom, 20);
        //Click the variable
        clickOnElement(_clickDigitalStrom);
    }
    public void clickOnEmailButton() {
        //wait for 20 second for clickable
        waitUntilElementClickable(_clickOnEmail, 10);
        //Click the variable
        clickOnElement(_clickOnEmail);
    }
}
