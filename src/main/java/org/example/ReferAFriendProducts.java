package org.example;

import org.openqa.selenium.By;

public class ReferAFriendProducts extends Utils {
// Refer a product to a friend. Current product Camera and photo

    private By _clickOnElectronics = By.xpath("//a[contains(@href, '/electronics')]");
    private By _clickOnCameraAndPhoto = By.xpath("//h2[@class='title']/a[@href='/camera-photo']");

    private By _clickOnNikon = By.xpath("//a[contains(@href,'/nikon-d5500-dslr')]");

    public void referAProductComputer() {
        clickOnElement(_clickOnElectronics);
        clickOnElement(_clickOnCameraAndPhoto);
        clickOnElement(_clickOnNikon);

    }
}
