package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ElecronicsProductAddSuceessfully extends Util{//ElecronicsProductAddSuceessfully is sub class of Util class
    //Create a variable for store xpath value
    private By _htcProductAddMassage = By.xpath("//td[@class=\"product\"]/a[text () = \"HTC One M8 Android L 5.0 Lollipop\"]");
    //Create a variable for store string value.
    String expectHtcProductAddMassage = "HTC One M8 Android L 5.0 Lollipop";
    //Create a variable for store xpath value
    private By _nokiaProductAddMassage = By.xpath("//td[@class=\"product\"]/a[text () = \"Nokia Lumia 1020\"]");
    //Create a variable for store string value.
    String expectNokiaProductAddMassage = "Nokia Lumia 1020";

    public void vrifyProductAddSuccessfully(){
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_htcProductAddMassage),expectHtcProductAddMassage,"Product Does Not Match");
        //sout get text value
        System.out.println(getTextFromElement(_htcProductAddMassage));
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_nokiaProductAddMassage),expectNokiaProductAddMassage,"Product Does Not Match");
        //sout get text value
        System.out.println(getTextFromElement(_nokiaProductAddMassage));
    }
}

