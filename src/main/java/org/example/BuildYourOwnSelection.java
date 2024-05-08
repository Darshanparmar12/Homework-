package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnSelection extends Utils {

 //Build your own computer product page

     private By _addingProduct = By.xpath("//h2[@class='product-title']/a[@href='/build-your-own-computer']") ;
    private By _selection1 = By.id("product_attribute_1");
    private By _selection2 = By.id("product_attribute_2");
    private By _selection3 = By.id("product_attribute_3_7");
    private By _addToCart =  By.id("add-to-cart-button-1");
    public void computerAdding() {
        //creating object for dropdown option
        Select processorDropDown = new Select(driver.findElement(_selection1));
        Select ramDropDown = new Select(driver.findElement(_selection2));

        //navigate to build-your-own-computer product
        clickOnElement(_addingProduct);

        //selecting option 2 of respective category
        processorDropDown.selectByIndex(2);
        ramDropDown.selectByVisibleText("4GB [+$20.00]");
        clickOnElement(_selection3);
        //add to cart
        clickOnElement(_addToCart);

    }

}


