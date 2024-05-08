package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

import static java.awt.SystemColor.text;


public class ShoppingCartPage extends Utils {


    LoadProp loadProp = new LoadProp();
    //verifying expected add to cart matches with product present in shopping cart

    private By _displayCart = By.className("ico-cart");
    private By _actualCartDisplay = By.className("product-name");

    public void verifyShoppingCartPage() {
        //expected from test data
        String expectedMsg = loadProp.getProperty("expectedResultForComputer");
        //capturing actual msg to compare

        String actualMsg = getText(_actualCartDisplay);

        clickOnElement(_displayCart);
        //      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='attributes']")), loadProp.getProperty("expectedResultForComputer"));
        Assert.assertEquals(actualMsg, expectedMsg, "Different Product");
    }

}
