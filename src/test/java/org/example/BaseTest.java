package org.example;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Util{//BaseTest is sub class of Util class

    BrowserManager browserManager = new BrowserManager();//Create a object of BrowserManager Class

    @BeforeTest//Run Before The All Test
    public void setBrowser(){
        browserManager.setChromeBrowser();//call Method of BrowserManager class
    }

    @AfterTest//Run After The All Test
    public void closeBrowser(){
        //call Method of BrowserManager class
        browserManager.closeBrowser();//close browser
    }


}
