package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BillingPage extends Utility {
    public BillingPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = " //select[@id='BillingNewAddress_CountryId']")
    WebElement countryName;
    @CacheLookup
    @FindBy(xpath = " //input[@id='BillingNewAddress_City']")
    WebElement cityName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement add1;
    @CacheLookup
    @FindBy(xpath = " //input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement pNumber;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    public void selectCountryName(String countryName) {
        Reporter.log("select country" + country.toString());
        selectByVisibleTextFromDropDown(country, countryName);
    }


    public void enterCityName(String cName) {

        Reporter.log("Enter city name" + cName + " to cpassword field" + cityName.toString());
        sendTextToElement(cityName, cName);
    }

    public void enterAdd1(String adderess) {
        Reporter.log("Enter Adderess" + adderess + " to cpassword field" + add1.toString());
        sendTextToElement(add1, adderess);
    }

    public void enterPostalCode(String pCode) {
        Reporter.log("Enter postal code" + pCode + " to cpassword field" + postalCode.toString());
        sendTextToElement(postalCode, pCode);
    }

    public void enterPhoneNumber(String number) {
        Reporter.log("Enter Phone number" + number + " to cpassword field" + pNumber.toString());
        sendTextToElement(pNumber, number);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name) {
        Reporter.log("Enter First name +" + name + "to first name field" + firstName.toString());
        sendTextToElement(firstName, name);

    }

    public void enterLastNameInTheLastNameField(String lastname) {
        Reporter.log("Enter last name " + lastname + " to cpassword field" + lastname.toString());
        sendTextToElement(lastName, lastname);

    }

    public void enterRandomEmailInTheEmailField() {
        Reporter.log("Enter email" + email.toString());
        sendTextToElement(email, getRandomString(4));
    }

    public void waitForElement() {
        waitUntilVisibilityOfElementLocated(By.cssSelector("#BillingNewAddress_City"), 2000);
    }

    public void selectCountry(String cName) {
        selectByVisibleTextFromDropDown(countryName, cName);
    }
}





