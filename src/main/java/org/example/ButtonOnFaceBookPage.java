package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class ButtonOnFaceBookPage extends Util {//ButtonOnFaceBookPage is sub class of Util class
    //Create a variable for store xpath value.
    private By _clickOnFaceBookLinkText = By.xpath("//ul[@class=\"networks\"]/li[1]/a");
    //Create a variable for store xpath value.
    private By _verifyCreateAPageButton = By.xpath("//div[@class=\"_3-8z\"]/div/div/button");
    //string value store
    String _expectCreateAPageButton = "Create a Page";


    public void clickOnFaceBookLinkText()
    {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnFaceBookLinkText, 10);
        //Click the variable
        clickOnElement(_clickOnFaceBookLinkText);
        //MainWindow store in variable
        String MainWindow = driver.getWindowHandle();
        //set the all windows all handles
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        //while loop use for verify windows
        while (iterator.hasNext())
        {
            String ChildWindow = iterator.next();
            //if condition use for compare main and child windows
            if (!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                //assert equals for expect URl and actual URl
                assertTrue(getCurrentUrl("https://www.facebook.com/nopCommerce"), "User Is Not FaceBook Page.");
                //assert equals for expect and actual result for create a page
                Assert.assertEquals(getTextFromElement(_verifyCreateAPageButton), _expectCreateAPageButton, "Create A Page Is Not Available");
                // Locating email web element
                WebElement _verifyColor = driver.findElement(By.xpath("//div[@class=\"_3-8z\"]/div/div/button"));
                // Get value of Css property border-bottom-color which will be returned in RGB format.
                String colorCode = _verifyColor.getCssValue("border-bottom-color");
                //string value store
                String expectedColorCodeInRGB = "rgba(66, 183, 42, 1)";
                //assert equals for expect and actual result for color
                Assert.assertEquals(colorCode, expectedColorCodeInRGB);
                //close this window or child
                System.out.println("User Verify Create A Page Button SuccessFully !!!");//sout String value
            }
        }
    }
}


