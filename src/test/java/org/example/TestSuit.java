package org.example;

import org.testng.annotations.Test;

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
    //Crate Object Of ElectronicsProductAddSuceessfully
    ElecronicsProductAddSuceessfully elecronicsProductAddSuceessfully = new ElecronicsProductAddSuceessfully();

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
    public void userShouldBeAbleToAddProductToBasketSuccessfully(){
        electronicsPage.clickOnElectronicsCategory();//Call Method From electronicsPage
        electronicsPage.verifyUserIsOnElectronicsPage();//Call Method From electronicsPage
        electronicsPage.ClickOnCellPhoneClick();//Call Method From electronicsPage
        electronicsPage.clickOnCartButton();//Call Method From electronicsPage
        electronicsProductOnShoppingCart.clickOnShoppingCart();//Call Method From electronicsProductOnShoppingCart
        elecronicsProductAddSuceessfully.vrifyProductAddSuccessfully();//Call Method From elecronicsProductAddSuceessfully
    }
}
