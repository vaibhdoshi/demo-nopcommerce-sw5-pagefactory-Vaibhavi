package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PaymentMethodPage extends Utility {

    public PaymentMethodPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(id = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement continueButton;


    public void clickOnCreditCardRadioButton() {
        Reporter.log("Click on credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on contine button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
