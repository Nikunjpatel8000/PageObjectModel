package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class NewsPageComment extends Util {//NewsPageComment is sub class of Util class
    //Create a variable for store xpath value.
    private By _clickOnDatails = By.xpath("//div[@class=\"news-items\"]/div[1]/div[3]/a");
    //Create a variable for store xpath value.
    private By _typeTitle = By.xpath("//div[@class=\"inputs\"]/input");
    //Create a variable for store xpath value.
    private By _typeComment = By.xpath("//div[@class=\"form-fields\"]/div[2]/textarea");
    //Create a variable for store xpath value.
    private By _clickNewComment = By.xpath("//div[@class=\"buttons\"]/input");
    //Create a variable for store xpath value.
    private By _addCommentmessage = By.xpath("//div[@class=\"notifications\"]/div");
    // store string value.
    String _expectAddCommentmessage = "News comment is successfully added.";
    //Create a variable for store xpath value.
    private By _addCommentSuccessfully = By.xpath("//div[@class=\"comment-title\"]/strong[text () = \"New Report\"]");
    // store string value.
    String  _expectAddCommentSuccessfully = "New Report";


    public void clickOnDetailsButton()
    {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnDatails,10);
        //Click the variable
        clickOnElement(_clickOnDatails);
    }
    public void verifyUserIsOnNewsPage()
    {
        Assert.assertTrue(getCurrentUrl("new-online-store-is-open"),"User Is Not News Page");
    }
    public void fillUpTitleAndComment()
    {
        //Type Text  Topic Name (Text Box).
        typeText(_typeTitle,"New Report");
        sleep(3);
        //Type Text Comment (Text Box).
        typeText(_typeComment,"Your Last report is awesome.Create a new report !!!");
    }
    public void clickOnNewComment()
    {
        //wait for 10 second for clickable
       waitUntilElementClickable(_clickNewComment,10);
        //Click the variable
       clickOnElement(_clickNewComment);
    }
    public void verifyCommentIsAdd()
    {
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_addCommentmessage),_expectAddCommentmessage,"Comment not add");
        System.out.println(getTextFromElement(_addCommentmessage));//sout get text value
    }
    public void addCommentSuccessfully()
    {
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_addCommentSuccessfully),_expectAddCommentSuccessfully,"User Add Comments Successfully");
    }
    public void addCommentAlwaysLast()
    {
        //array string commentslast object create
        ArrayList<String> commentsLast = new ArrayList<String>();
        //Instantiating an ArrayList object
        commentsLast.add("New Report");
        commentsLast.get(commentsLast.size()-1);//last always comments
    }
}


