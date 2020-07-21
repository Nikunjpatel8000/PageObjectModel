package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TopicAndCheckBoxFillUp extends Util//TopicAndCheckBoxFillUp is sub class of Util class
   {
       //Create a variable for store xpath value.
       private By _typeTextTopic = By.xpath("//input[@type=\"text\"]");
       //Create a variable for store xpath value.
       private By _checkBoxClick = By.xpath("//input[@type=\"checkbox\"]");
       //Create a variable for store xpath value.
       private By _dropDownSelect = By.xpath("//select[@id=\"animals\"]");


       public void browserOpen(){
           //chrome driver path setup
           System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserSet\\chromedriver.exe");
           driver = new ChromeDriver();//object of chrome driver or chrome driver open
           driver.manage().window().maximize();//run time windows size maximize
           //wait for 10 second before all test case
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("\n"+"https://chercher.tech/practice/frames-example-selenium-webdriver");//type URL
       }

      public void verifyUserIsHomePage()
      {
          //assert equals for expect URl and actual URl
          Assert.assertTrue(getCurrentUrl("/practice/frames-example-selenium-webdriver"),"User Is Not HomePage");
      }
      public void verifyTypeTextTopic()
      {
          //driver switch method call for iFrame id
          driverSwitch("frame1");
          //Type Text Topic Name (Text Box).
          typeText(_typeTextTopic,"New Requirement");
          //driver switch method call for iFrame id
          driverSwitch("frame3");
          //wait for 10 second for clickable
          waitUntilElementClickable(_checkBoxClick,10);
          //Click the variable
          clickOnElement(_checkBoxClick);
          sleep(5);//sleep for 5 sec
          switchParent();//go back window
          switchParent();//go back again back window
          //driver switch method call for iFrame id
          driverSwitch("frame2");
          //select by month use by visible text (Drop Down).
          selectFromDropDownByVisibleText(_dropDownSelect,"Avatar");
          //sout String value
          System.out.println("User FillUp All Of Details !!!");
          switchParent();//go back window

      }

   }


