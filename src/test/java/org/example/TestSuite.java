package org.example;

import org.testng.annotations.Test;


public class TestSuite extends BaseTest {


    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    BuildYourOwnSelection buildYourOwnSelection = new BuildYourOwnSelection();

    EmailAFriend emailAFriend = new EmailAFriend();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    ReferAFriendProducts referAFriend = new ReferAFriendProducts();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ComputerPage computerPage = new ComputerPage();

    DesktopPage desktopPage = new DesktopPage();

    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    VoteFeature voteFeature = new VoteFeature();

    SearchPage searchPage = new SearchPage();

    CurrencyCheck currencyCheck = new CurrencyCheck();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify
        registerResultPage.verifyUserRegisteredSuccessfully();


    }

    @Test
    public void verifyRegisteredUserShouldLogin() {


        homePage.logInUser();
    }

    @Test
    public void verifyRegisteredUserShouldReferAProduct() {
        //log in from login details previously used
        homePage.logInUser();
        //Camera-photo product referral in this case.
        referAFriend.referAProductComputer();
        emailAFriend.referFriend();
    }

    @Test
    public void verifyBuildMyOwnComputerSuccessful() {
        // selecting second option of the selected product to be added in cart
        buildYourOwnSelection.computerAdding();
        // adding selected product to cart.
        shoppingCartPage.verifyShoppingCartPage();
        //verifying same product in shopping cart.
    }

    @Test
    public void verifyEachProductShouldHaveATitle() {
        //click on computer and go to desktop
        computerPage.openComputerPage();
        //verify each product name
        desktopPage.verifyProductName();

    }

    @Test
    public void verifyAddToCartPresent() {

//    go to electronics
        homePage.clickOnElectronics();
//    click camera&photo and verify add to cart button
        cameraAndPhotoPage.cameraAndPhotoProducts();
    }

    @Test
    public void searchBarAlertHandling() {

        //click on submit from homepage and verify alert message
        searchPage.searchBarInput();

        //accept alert msg
        acceptAlert();
    }

    @Test
    public void votingOnWebsite() {

        //submit vote and verify alert msg
        voteFeature.voteSubmit();

        //accept alert msg
        acceptAlert();
    }

    @Test
    public void verifyCommentDone() {

        //comment and then verify it is last
        homePage.viewPostForComment();

    }

    @Test
    public void verifyCurrencyButton(){
        //select currency euro
        currencyCheck.currencyChange();
        //verifying product in selected currency
        currencyCheck.currencyDoubleCheck();

        //switching currency back to US dollar
        currencyCheck.backTODefaultCurrencyDollar();
        //verifying product in selected currency
        currencyCheck.currencyDoubleCheck();
    }

//    @Test
//    public void searchTestOnNike(){
//        searchPage.nikeSearchResult();
//    }
}