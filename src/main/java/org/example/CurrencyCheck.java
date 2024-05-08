package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CurrencyCheck extends Utils {
    private By _priceinCurrency = By.className("prices");

    private By _changeToEuro = By.xpath("//*[@id=\"customerCurrency\"]/option[2]");
    private By _changeToDollar = By.xpath("//*[@id=\"customerCurrency\"]/option[1]");
    LoadProp loadProp = new LoadProp();

    public void currencyChange() {
        //selection of currency
        clickOnElement(By.id("customerCurrency"));

        clickOnElement(_changeToEuro);
    }


    public void currencyDoubleCheck() {


        //store element data in eurocheck variable
        WebElement euroCheck = driver.findElement(_priceinCurrency);

        //created another string to use in if else condition to use .contain condition
        String euroSymbol = euroCheck.getText();
        //    List<WebElement>euroCheck = driver.findElements(By.xpath("//div[@class='product-item']/div/div[3]/div/span"));

        if (euroSymbol.contains("€")) { // first time when it runs it should be Euro
            System.out.println(loadProp.getProperty("expectedEuroLine"));

        } else if (euroSymbol.contains("$")) { //second time when it runs it should be dollar
            System.out.println(loadProp.getProperty("expectedUsDollarLine"));

        } else {
            System.out.println("Null");
        }
    }

    public void backTODefaultCurrencyDollar() {

        //separate method to select dollar currency from top
        clickOnElement(By.id("customerCurrency"));

        //  Select currency = new Select(driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]")));
        // currency.selectByValue("Dollar");

        clickOnElement(_changeToDollar);
    }


}







