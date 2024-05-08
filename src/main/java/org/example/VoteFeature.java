package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteFeature extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _clickOnVote = By.id("vote-poll-1");

    //to navigate to vote button
    public void voteSubmit() {
        //click on vote
        clickOnElement(_clickOnVote);
        //copy alert message
        String alertActualMsg = driver.switchTo().alert().getText();
        //verify alert message with expected alert message
        Assert.assertEquals(alertActualMsg, loadProp.getProperty("votingExpectedAlertMsg"));
    }
}
