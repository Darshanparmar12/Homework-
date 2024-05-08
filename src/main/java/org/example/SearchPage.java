package org.example;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.reporters.FailedReporter;

import java.util.List;

public class SearchPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _clickOnSearch = By.xpath("//*[@id=\"small-search-box-form\"]/button");

    private By _productList = By.className("product-title");
    public void searchBarInput() {
        clickOnElement(_clickOnSearch);
        //copy alert message
        String alertActualMessage = driver.switchTo().alert().getText();
        //verify with expected
        Assert.assertEquals(alertActualMessage, loadProp.getProperty("searchExpectedAlertMsg"));
    }


//        public void nikeSearchResult(){
//
//        //input nike in search
//            typeIn(By.id("small-searchterms"), "Nike");
//            clickOnElement(_clickOnSearch);
//
//
//           WebElement nikeProductList = driver.findElement(_productList);
//
//           System.out.println(nikeProductList);
//
////            String nikeText = nikeProductList.getText();
////
////
////            Assert.assertEquals(nikeText,"Nike");
//
//        }

}
