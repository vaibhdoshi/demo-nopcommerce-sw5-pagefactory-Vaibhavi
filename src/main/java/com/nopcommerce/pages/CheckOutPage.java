package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutAsGuest;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastname;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAirRadio;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton2;


    public String verifyWelcomeText() {
        Reporter.log("verify welcome message" + welcomeMessage.toString());
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnCheckOutasGuestTab() {
        Reporter.log("click on check out as guest tab" + checkoutAsGuest.toString());
        clickOnElement(checkoutAsGuest);
    }

    public void selectCountry(String countryName) {
        Reporter.log("select country" + country.toString());
        selectByVisibleTextFromDropDown(country, countryName);
    }

    public void enterDataInTheCityField(String cityName) {
        Reporter.log("enter city" + cityName + "in city field" + city.toString());
        sendTextToElement(city, cityName);
    }

    public void enterDataInTheAddress1Field(String add1) {
        Reporter.log("enter address" + add1 + "in address field" + address1.toString());
        sendTextToElement(address1, add1);
    }

    public void enterDataInTheZipPostalCodeField(String pCode) {
        Reporter.log("enter postcode" + pCode + "in postcode field" + zipPostalCode.toString());
        sendTextToElement(zipPostalCode, pCode);
    }

    public void enterDataInTheMobileNumberField(String mobile) {
        Reporter.log("enter mobile" + mobile + "in mobile field" + phoneNumber.toString());
        sendTextToElement(phoneNumber, mobile);
    }

    public void clickOnContinueButton() {
        Reporter.log("click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name) {
        Reporter.log("enter firstname" + name + "in name field" + firstname.toString());
        sendTextToElement(firstname, name);
    }

    public void enterLastNameInTheLastNameField(String lastName) {
        Reporter.log("enter lastname" + lastName + "in name field" + lastname.toString());
        sendTextToElement(lastname, lastName);

    }

    public void enterRandomEmailInTheEmailField(String email) {
        Reporter.log("enter email address" + email + "in email field" + emailField.toString());
        sendTextToElement(emailField, email);
    }


    public void clickOnNextDayRadioButton() {
        try {
            clickOnElement(nextDayAirRadio);
        } catch (
                NoSuchElementException e) {
            clickOnElement(By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']"));
        }
    }

    public void clickOnCreditCardButton() {
        Reporter.log("click on credit cart button" + creditCard.toString());
        clickOnElement(creditCard);
    }

    public void clickOnContinueButton1() {
        Reporter.log("click on continue button1" + continueButton1.toString());
        clickOnElement(continueButton1);
    }

    public void clickOnContinueButton2() {
        Reporter.log("click on continue button2" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    public void clickOnPopUp() {
        dismissAlert();
    }

}
