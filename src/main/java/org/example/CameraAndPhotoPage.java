package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils {

    private By _cameraAndPhotoButton = By.xpath("//div[@class='sub-category-item']//h2//a[@href='/camera-photo']");

    public void cameraAndPhotoProducts() {
        //navigate to camera and photo page
        clickOnElement(_cameraAndPhotoButton);
        List<WebElement> addToCartButton = driver.findElements(By.xpath("//div[@class='product-item']/div/div[3]/div[@class='buttons']"));
        for (WebElement element : addToCartButton) {
            System.out.println(element.getText());
            Assert.assertEquals((element.getText()), "ADD TO CART Add to compare list Add to wishlist`");

        }

    }

}
