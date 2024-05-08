package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

    private By _openComputer = By.xpath("//a[@href='/computers']");
    private By _openDesktop = By.xpath("//h2[@class='title']/a[@href='/desktops']");

    public void openComputerPage() {
        // click on computer
        clickOnElement(_openComputer);

        //click on desktop
        clickOnElement(_openDesktop);
    }
}

