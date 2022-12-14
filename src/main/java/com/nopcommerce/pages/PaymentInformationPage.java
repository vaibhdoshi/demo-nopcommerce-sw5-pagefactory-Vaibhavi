package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentInformationPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton3;

    public void selectCreditCardType(int index) {
        Reporter.log("select credit card type" + creditCard.toString());
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name) {
        Reporter.log("enter cardholdre name" + name + "in cardholder field" + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num) {
        Reporter.log("enter cardholdrer number" + num + "in number field" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon) {
        Reporter.log("enter expiry month" + mon + "in field" + expiryMonth.toString());
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr) {
        Reporter.log("enter expire year" + yr + "in field" + expiryYear.toString());
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        Reporter.log("enter card code" + code + "in field" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton3() {
        Reporter.log("click on continue button" + continueButton3.toString());
        clickOnElement(continueButton3);
    }


}
