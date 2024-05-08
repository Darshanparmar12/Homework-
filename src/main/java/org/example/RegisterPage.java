package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    //to call test data in this method.
    LoadProp loadProp = new LoadProp();

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.name("Password");
    private By _confirmPassword = By.name("ConfirmPassword");
    private By _clickOnRegisterButton = By.id("register-button");

    //enter registration details
    public void enterRegistrationDetails() {

        typeIn(_firstName, loadProp.getProperty("firstName"));
        typeIn(_lastName, loadProp.getProperty("lastName"));
        typeIn(_email, loadProp.getProperty("emailA"));
        typeIn(_email, randomDate()); // to have random date in between to make sure uniqueness.
        typeIn(_email, loadProp.getProperty("emailB"));
        typeIn(_password, loadProp.getProperty("password"));
        typeIn(_confirmPassword, loadProp.getProperty("confirmPassword"));
        clickOnElement(_clickOnRegisterButton);
    }

    public void registrationForLogin() {

        clickOnElement(By.linkText("Register"));
        clickOnElement(By.linkText("Register"));
        typeIn(By.id("FirstName"), loadProp.getProperty("firstName"));
        typeIn(By.id("LastName"), loadProp.getProperty("lastName"));
        typeIn(By.id("Email"), loadProp.getProperty("emailForLogin"));
        typeIn(By.name("Password"), loadProp.getProperty("password"));
        typeIn(By.name("ConfirmPassword"), loadProp.getProperty("confirmPassword"));
        clickOnElement(By.id("register-button"));

    }
}
