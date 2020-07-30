package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxOpen {

    static WebDriver driver ;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Soft\\FireFoxDriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        driver.quit();

    }




}
