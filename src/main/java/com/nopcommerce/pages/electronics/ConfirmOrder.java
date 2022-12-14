package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ConfirmOrder extends Utility {
    public ConfirmOrder() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCard;

    @CacheLookup
    @FindBy(css = "li[class='shipping-method'] span[class='value']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$698.00')]")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$2,950.00')]")
    WebElement totalAmountComputers;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;


    public String getTextFromPaymentMethodText() {
        Reporter.log("Get tect from payment method text");
        return getTextFromElement(creditCard);
    }

    public String getTextFromShippingMethodText() {
        Reporter.log("Get text from shipping method text" + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String getTextFromTotalAmountField() {
        Reporter.log("get text from toal amountfield" + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }
    public String getTextFromTotalAmountComputersField() {
        Reporter.log("Get text from total Amount computers field" + totalAmountComputers.toString());

        return getTextFromElement(totalAmountComputers);
    }

    public void clickOnConfirmButton() {
        Reporter.log("click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }


}
