package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DesktopPage extends Utils {

    private By _productList = By.xpath("//div[@class='item-grid']//h2");

    //verifying each product on desktop page
    public void verifyProductName() {
        List<WebElement> productTitleElementList = driver.findElements(_productList);

        for (WebElement element : productTitleElementList) {
            System.out.println(element.getText());
            Assert.assertNotNull(element.getText(), "one of the product title is missing");

        }
    }

}
