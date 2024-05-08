package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _emailFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");
    private By _friendEmail = By.id("FriendEmail");
    private By _sendEmail = By.xpath("//button[@class='button-1 send-email-a-friend-button']");

    //  to email a friend every now and then.
    public void referFriend() {   //created to use this method for other products

        //  clickOnElement(By.className("email-a-friend"));
        clickOnElement(_emailFriend);

        typeIn(_friendEmail, loadProp.getProperty("friendEmail"));

        //  typeIn(By.id("YourEmailAddress"), loadProp.getProperty("emailForLogin"));

        clickOnElement(_sendEmail);
    }
}
