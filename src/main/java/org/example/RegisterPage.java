package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage  extends Util{//RegisterPage is sub class of Util class
    //Create a variable for store xpath value.
    private By _selectGender = By.xpath("//input[@id=\"gender-male\"]");
    //Create a variable for store xpath value.
    private By _firstName = By.xpath("//div[@class=\"fieldset\"]//div[2]/div[2]/input");
    //Create a variable for store xpath value.
    private By _lastName = By.xpath("//div[@class=\"fieldset\"]//div[2]/div[3]/input");
    //Create a variable for store xpath value.
    private By _dateOfDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    //Create a variable for store xpath value.
    private By _dateOfMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    //Create a variable for store xpath value.
    private By _dateOfYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    //Create a variable for store xpath value.
    private By _emailId = By.xpath("//div[@class=\"fieldset\"]//div[2]/div[5]/input");
    //Create a variable for store xpath value.
    private By _companyName = By.xpath("//input[@id=\"Company\"]");
    //Create a variable for store xpath value.
    private By _newsSletter = By.xpath("//input[@id=\"Newsletter\"]");
    //Create a variable for store xpath value.
    private By _password  = By.xpath("//div/form[@method=\"post\"]/div[4]/div[2]/div/input");
    //Create a variable for store xpath value.
    private By _confirmPassword = By.xpath("//div/form[@method=\"post\"]/div[4]/div[2]/div[2]/input");
    //Create a variable for store xpath value.
    private By _clickOnRegisterSubmitButton = By.xpath("//input[@id=\"register-button\"]");

    public void verifyUserIsOnRegisterPage(){
        //assert equals for expect URl and actual URl
        Assert.assertTrue(getCurrentUrl("register"),"User Is Not Register Page");
    }
    public void userEntersRegistationDetails(){
        //wait for 10 second for clickable
        waitUntilElementClickable(_selectGender,10);
        //Click the variable
        clickOnElement(_selectGender);
        sleep(3);//sleep 3 second
        //wait for 10 second for clickable
        waitUntilElementClickable(_firstName,10);
        //Type Text First name (Text Box).
        typeText(_firstName,"Raj");
        //wait for 10 second for clickable
        waitUntilElementClickable(_lastName,10);
        //Type Text Last name (Text Box).
        typeText(_lastName,"Patel");
        //select by day use by (22) index (Drop Down).
        selectFromDropDownByIndex(_dateOfDay,22);
        //select by month use by visible text (Drop Down).
        selectFromDropDownByVisibleText(_dateOfMonth,"November");
        //select by day use by value (Drop Down).
        selectFromDropDownByValu(_dateOfYear,"1990");
        //Type Text Email Id (Text Box).
        typeText(_emailId,"testing+"+timeStamp()+"@gmail.com");
        //type Text Company Name (Text Box).
        typeText(_companyName,"T Group Of Company Ltd");
        //select newsletter (check box).
        waitUntilElementClickable(_newsSletter,10);
        //Click the variable
        clickOnElement(_newsSletter);
        //Type Text password (Text Box).
        typeText(_password,"Test@123");
        //Type Text conform password (Text Box).
        typeText(_confirmPassword,"Test@123");
    }
    public void clickOnRegisterSubmitButton(){
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnRegisterSubmitButton,10);
        //Click the variable
        clickOnElement(_clickOnRegisterSubmitButton);
    }
}







