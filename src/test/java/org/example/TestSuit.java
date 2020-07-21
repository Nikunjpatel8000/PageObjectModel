package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest {//TestSuit is sub class of BaseTest class
    //Crate Object Of Home Page
    HomePage homePage = new HomePage();
    //Crate Object Of RegisterPage
    RegisterPage registerPage = new RegisterPage();
    //Crate Object Of RegisterSuccessPage
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    //Crate Object Of ComputerCategory
    ComputerCategory computerCategory = new ComputerCategory();
    //Crate Object Of ComputerPage
    ComputerPage computerPage = new ComputerPage();
    //Crate Object Of ComputerSendEmailFriend
    ComputerSendEmailFriend computerSendEmailFriend = new ComputerSendEmailFriend();
    //Crate Object Of ComputerSendEmailSuccessMassage
    ComputerSendEmailSuccessMassage computerSendEmailSuccessMassage = new ComputerSendEmailSuccessMassage();
    //Crate Object Of ElectronicsPage
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //Crate Object Of ElectronicsProductOnShoppingCart
    ElectronicsProductOnShoppingCart electronicsProductOnShoppingCart = new ElectronicsProductOnShoppingCart();
    //Crate Object Of ElectronicsProductAddSuccessfully
    ElecronicsProductAddSuceessfully elecronicsProductAddSuceessfully = new ElecronicsProductAddSuceessfully();
    //Crate Object Of AcceptAlert
    AcceptAlert acceptAlert = new AcceptAlert();
    //Crate Object Of NewsPageComment
    NewsPageComment newsPageComment = new NewsPageComment();
    //Crate Object Of TopicAndCheckBoxFillUp
    TopicAndCheckBoxFillUp topicAndCheckBoxFillUp = new TopicAndCheckBoxFillUp();
    //Crate Object Of ButtonOnFaceBookPage
    ButtonOnFaceBookPage buttonOnFaceBookPage = new ButtonOnFaceBookPage();
    //Crate Object Of ChangeTheCurrency
    ChangeTheCurrency changeTheCurrency = new ChangeTheCurrency();


    @Test(priority = 1)
    public void verifyUserShouldBeAbleRegisterSuccessfully() {
        homePage.verifyUserIsOnHomePage();//Call Method From HomePage
        homePage.clickOnRegisterButton();//Call Method From HomePage
        registerPage.verifyUserIsOnRegisterPage();//Call Method From registerPage
        registerPage.userEntersRegistationDetails();//Call Method From registerPage
        registerPage.clickOnRegisterSubmitButton();//Call Method From registerPage
        registerSuccessPage.verifyUserRegistrationSuccessfully();//Call Method From registerSuccessPage

    }

    @Test(priority = 2)
    public void registerUserShouldBeAbleToReferAProductToAFriendSuccessfully() {
        computerCategory.clickOnComputerCategory();//Call Method From computerCategory
        computerPage.verifyUserIsOnComputerPage();//Call Method From computerPage
        computerPage.clickOnDesktopsCategory();//Call Method From computerPage
        computerPage.clickOnDigitalProduct();//Call Method From computerPage
        computerPage.clickOnEmailButton();//Call Method From computerPage
        computerSendEmailFriend.enterDatailsOfFriend();//Call Method From computerSendEmailFriend
        computerSendEmailFriend.clickOnEmailSendButton();//Call Method From computerSendEmailFriend
        computerSendEmailSuccessMassage.verifyUserSendEmailAFriendSuccessfully();//Call Method From computerSendEmailSuccessMassage
    }

    @Test(priority = 3)
    public void userShouldBeAbleToAddProductToBasketSuccessfully() {
        electronicsPage.clickOnElectronicsCategory();//Call Method From electronicsPage
        electronicsPage.verifyUserIsOnElectronicsPage();//Call Method From electronicsPage
        electronicsPage.ClickOnCellPhoneClick();//Call Method From electronicsPage
        electronicsPage.clickOnCartButton();//Call Method From electronicsPage
        electronicsProductOnShoppingCart.clickOnShoppingCart();//Call Method From electronicsProductOnShoppingCart
        elecronicsProductAddSuceessfully.vrifyProductAddSuccessfully();//Call Method From elecronicsProductAddSuceessfully
    }

    @Test(priority = 4)
    public void verifyEachProductName() {  //find the elements by xpath
        List<WebElement> productList = driver.findElements(By.xpath("//div[contains(@class,\"product\")]/div[2]/div/div[1]/div[2]/h2/a"));
        //use for each loop for get each product name
        for (WebElement product : productList) {  //all product name print
            System.out.println(product.getText());
        }
    }

    @Test(priority = 5)
    public void userVerifyAlert() {
        homePage.verifyUserIsOnHomePage();//Call Method From homePage
        acceptAlert.userAcceptAlert();//Call Method From acceptAlert
    }

    @Test(priority = 6)
    public void userFillUpComment() {
        homePage.verifyUserIsOnHomePage();//Call Method From homePage
        newsPageComment.clickOnDetailsButton();//Call Method From newsPageComment
        newsPageComment.verifyUserIsOnNewsPage();//Call Method From newsPageComment
        newsPageComment.fillUpTitleAndComment();//Call Method From newsPageComment
        newsPageComment.clickOnNewComment();//Call Method From newsPageComment
        newsPageComment.verifyCommentIsAdd();//Call Method From newsPageComment
        newsPageComment.addCommentSuccessfully();//Call Method From newsPageComment
        newsPageComment.addCommentAlwaysLast();//Call Method From newsPageComment
    }

    @Test(priority = 7)
    public void verifyFillUpAllTextBoxDropDownAndCheckBox() {
        topicAndCheckBoxFillUp.browserOpen();//Call Method From topicAndCheckBoxFillUp
        topicAndCheckBoxFillUp.verifyUserIsHomePage();//Call Method From topicAndCheckBoxFillUp
        topicAndCheckBoxFillUp.verifyTypeTextTopic();//Call Method From topicAndCheckBoxFillUp
    }

    @Test(priority = 8)
    public void verifyButtonOnFaceBookPage() {
        homePage.verifyUserIsOnHomePage();//Call Method From homePage
        buttonOnFaceBookPage.clickOnFaceBookLinkText();//Call Method From buttonOnFaceBookPage
    }

    @Test(priority = 9)
    public void userShouldBeAbleChangeTheCurrency() {
        homePage.verifyUserIsOnHomePage();//Call Method From homePage
        changeTheCurrency.verifyAllCurrencyRateInDoller();//Call Method From changeTheCurrency
        changeTheCurrency.verifyAllCurrencyRateInEuro();//Call Method From changeTheCurrency
    }
}
