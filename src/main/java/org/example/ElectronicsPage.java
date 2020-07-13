package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ElectronicsPage extends Util {//ElectronicsPage is sub class of Util class
    //Create a variable for store xpath value.
    private By _clickOnElectronics = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a");
    //Create a variable for store xpath value.
    private By _welcomeMsgElectronics = By.xpath("//div[@class=\"page-title\"]/h1");
    //Create a variable for store string value.
    String expectWelcomeMsgElectronics ="Electronics";
    //Create a variable for store xpath value.
    private By _cellPhoneClick = By.xpath("//ul[@class=\"sublist\"]/li[2]/a");
    //Create a variable for store xpath value.
    private By _htcPhone = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/input[1]");
    //Create a variable for store xpath value.
    private By _nokiaPhone = By.xpath("//div[@class=\"item-grid\"]/div[3]/div/div[2]/div[3]/div[2]/input[1]");

    public void verifyUserIsOnElectronicsPage() {
        //assert equals for expect and actual result
       Assert.assertEquals(getTextFromElement(_welcomeMsgElectronics),expectWelcomeMsgElectronics,"User Is Not Electronics Page");
    }
    public void clickOnElectronicsCategory() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnElectronics, 10);
        clickOnElement(_clickOnElectronics);
    }
    public void ClickOnCellPhoneClick() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_cellPhoneClick, 10);
        clickOnElement(_cellPhoneClick);
    }
    public void clickOnCartButton() {
        //wait for 20 second for clickable
        waitUntilElementClickable(_htcPhone, 20);
        //Click the variable
        clickOnElement(_htcPhone);
        sleep(10);//sleep 10 second
        //wait for 20 second for clickable
        waitUntilElementClickable(_nokiaPhone, 20);
        //Click the variable
        clickOnElement(_nokiaPhone);
    }


}








