package org.example;

import org.openqa.selenium.By;

import org.testng.Assert;


public class HomePage extends Utils {

    RegisterPage registerPage = new RegisterPage();

    LoadProp loadProp = new LoadProp();

    private By _registerButton = By.linkText("Register");
    private By _electronicsPage = By.xpath("//a[@href='/electronics']");
    private By _loginPage = By.className("ico-login");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _loginButton = By.xpath("//button[@class='button-1 login-button']");

    //created a method to click on Register button
    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    //to go to Electronics from HomePage
    public void clickOnElectronics() {
        clickOnElement(_electronicsPage);
    }

    //created a method to click on login user
    public void logInUser() {
        clickOnElement(_loginPage);
        typeIn(_email, loadProp.getProperty("emailForLogin"));
        typeIn(_password, loadProp.getProperty("password"));
        clickOnElement(_loginButton);
    }

    //navigate to comment
    public void viewPostForComment() {
        clickOnElement(By.xpath("//div[@class='buttons']//a[@href='/nopcommerce-new-release']"));
        //input title
        typeIn(By.className("enter-comment-title"), loadProp.getProperty("commentTitle"));
        //input comment text
        typeIn(By.className("enter-comment-text"), loadProp.getProperty("commentText"));
        //submit comment
        clickOnElement(By.name("add-comment"));
        //copy text to verify its last one in the list
        String verifyingCommentIsLast = getText(By.xpath("//*[@class='comments']/div[4]/div[2]/div[3]"));
        Assert.assertEquals(verifyingCommentIsLast, loadProp.getProperty("commentText"));
    }
}


//   public void openFacebookPage(){
//  clickOnElement(By.className("facebook"));
//
//
//        String mainWindow = driver.getWindowHandle();
//
//        //To handle all new opened window.
//        Set<String> w1 = driver.getWindowHandles();
//        Iterator<String> i1 = w1.iterator();
//
//        while(i1.hasNext())
//        {
//            String childWindow = i1.next();
//
//            if (!mainWindow.equalsIgnoreCase(childWindow))
//            {
//        clickOnElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span"));
//            clickOnElement(By.className("x92rtbv"));
//            String actualPageName= getText(By.xpath("//div[@class='x1e56ztr x1xmf6yo']//h1"));
//            Assert.assertEquals(actualPageName,"Nepocommerce");
//            driver.close();
//            }
//    }

