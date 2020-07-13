package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{//BrowserManager is sub class of Util class


    public void setChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserSet\\chromedriver.exe");//chrome driver path setup
        driver = new ChromeDriver();//object of chrome driver or chrome driver open
        driver.manage().window().maximize();//run time windows size maximize
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait for 10 second before all test case
        driver.get("https://demo.nopcommerce.com/");//type URL

    }
    public void closeBrowser() {
        driver.close();//close Browser
    }


}
