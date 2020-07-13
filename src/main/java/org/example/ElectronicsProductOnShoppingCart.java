package org.example;

import org.openqa.selenium.By;

public class ElectronicsProductOnShoppingCart extends Util{//BrowserManager is sub class of Util class
    //Create a variable for store xpath value.
    private By _clickOnShoppingCart = By.xpath("//a[@class=\"ico-cart\"]/span[text()=\"Shopping cart\"]");

    public void clickOnShoppingCart(){
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnShoppingCart,10);
        //Click the variable
        clickOnElement(_clickOnShoppingCart);
    }
}






