package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChangeTheCurrency extends Util{//ChangeTheCurrency is sub class of Util class
    //Create a variable for store xpath value.
    private By _selectCurrencyDropDown = By.id("customerCurrency");
    //Create a variable for store xpath value.
    private By _verifyDollerCurrency = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div/div/span");
    //Create a variable for store xpath value.
    private By _verifyEuroCurrency = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div/div/span");



    public void verifyAllCurrencyRateInDoller()
    {  //list webElement locating
        List<WebElement> productList = driver.findElements(_verifyDollerCurrency);
        //use for each loop for get each product name
        for (WebElement product:productList)
        {  //all product name print
            System.out.println(product.getText().contains("$"));
        }
    }
    public void verifyAllCurrencyRateInEuro()
    {
        //select by month use by visible text (Drop Down).
        selectFromDropDownByVisibleText(_selectCurrencyDropDown,"Euro");
        //list webElement locating
        List<WebElement> productList = driver.findElements(_verifyEuroCurrency);
        //use for each loop for get each product name
        for (WebElement product:productList)
        {
            //all product name print
            System.out.println(product.getText().contains("€"));
            System.out.println("User Change Currency SuccessFully !!!");//sout String value
        }


    }
}
