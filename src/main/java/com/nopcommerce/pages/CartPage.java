package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfService;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public String verifyShoppingCartMessage() {
        Reporter.log("verify shopping cart message" + shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartMessage);
    }

    public void clearQuantity() {
        Reporter.log("clear quantity" + qtyField.toString());
        WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));
        qty.sendKeys(Keys.CONTROL + "a");
        qty.sendKeys(Keys.DELETE);
    }

    public void changeQuantity(String text){
        Reporter.log("change quantity" + qtyField.toString());
        sendTextToElement(qtyField,text);
    }

    public void clickOnUpdateShoppingCart(){
        Reporter.log("click on update shopping cart" + updateShoppingCart.toString());
        mouseHoverToElementAndClick(updateShoppingCart);
    }
    public String verifyTotal(){
        Reporter.log("verify total" + verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }
    public void clickOnTermsOFService(){
        Reporter.log("click on terms of service" + termsOfService.toString());
        mouseHoverToElementAndClick(termsOfService);
    }
    public void clickOnCheckoutButton(){
        Reporter.log("click on check out button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }
}






