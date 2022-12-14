package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShippingOption extends Utility {
    public ShippingOption() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton2ndDayAir;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement radioButtonNextDayAir;

    @CacheLookup
    @FindBy(id = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;


    public void clickOnButton2ndDayAir() {
        Reporter.log("Click on 2nddayAir button" + radioButton2ndDayAir.toString());
        clickOnElement(radioButton2ndDayAir);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton() {
        Reporter.log("Click on next day air button" + radioButtonNextDayAir.toString());
        clickOnElement(radioButtonNextDayAir);
    }


}
