package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PaymentDetail extends Utility {
    public PaymentDetail() {
        PageFactory.initElements(driver, this);
    }

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
    WebElement continueButton;

    public void selectCreditCardType(int index) {
        Reporter.log("Select creditcard type" + creditCard.toString());
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name) {
        Reporter.log("inputeCared holders name" + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num) {
        Reporter.log("Input card number" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon) {
        Reporter.log("Inpute ExpireMonth" + expiryMonth.toString());
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr) {
        Reporter.log("Input expire year" + yr + "to field" + expiryYear.toString());
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        Reporter.log("input card code" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
