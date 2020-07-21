package org.example;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Util{//BaseTest is sub class of Util class

    BrowserManager browserManager = new BrowserManager();//Create a object of BrowserManager Class

    @BeforeTest//Run Before The All Test
    public void setBrowser(){
        browserManager.setChromeBrowser();//call Method of BrowserManager class
    }

    @AfterMethod//Run After The All Test
    public void closeBrowser(ITestResult result){
        //if test failure then screen shot
        if (ITestResult.FAILURE == result.getStatus())
        {//screen shot name
           takeScreenShot(result.getName() + timeStamp());
        }

        //call Method of BrowserManager class
                browserManager.closeBrowser();//close browser
    }


}
