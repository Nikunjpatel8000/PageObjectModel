package org.example;

import org.openqa.selenium.By;

public class ComputerCategory extends Util {//ComputerCategory is sub class of Util class
    //Create a variable for store xpath value.
    private By _computerCategory = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");

    public void clickOnComputerCategory() {
        waitUntilElementClickable(_computerCategory, 10);//wait for 10 second for clickable
        clickOnElement(_computerCategory);//Click the variable
    }
}