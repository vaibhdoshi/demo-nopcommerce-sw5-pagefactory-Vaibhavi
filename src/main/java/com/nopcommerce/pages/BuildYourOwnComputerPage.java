package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(css = "div[class='product-name'] h1")
    WebElement buildYourOwnComputerMessage;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement os;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareBox2;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement actualTotal;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement productAddedMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closingBarButton;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartOption;

    public String getTextFromBuildYourOwnComputerMessage() {
        Reporter.log("get text from build your own computer message" + buildYourOwnComputerMessage.toString());
        return getTextFromElement(buildYourOwnComputerMessage);
    }

    public void selectGhzIntelPentiumDualCore() {
        Reporter.log("select Ghz Intel pentium dual core" + processor.toString());
        selectByValueFromDropDown(processor, "1");
    }

    public void selectRamAs8Gb(int index) {
        Reporter.log("select RAM as 8GB" + ram.toString());
        selectByIndexFromDropDown(ram, index);
    }

    public void selectHDDRadio() {
        Reporter.log("select HDD radio" + hdd.toString());
        clickOnElement(hdd);
    }

    public void selectOSRadioButton() {
        Reporter.log("select OS radio button" + os.toString());
        clickOnElement(os);
    }

    public void clickOnTotalCommander() {
        Reporter.log("click on total commander" + softwareBox2.toString());
        clickOnElement(softwareBox2);
    }

    public String getTextFromActualTotal() {
        Reporter.log("get text from actual total" + actualTotal.toString());
        return getTextFromElement(actualTotal);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("click on add to cart button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getTextFromProductHasBeenAddedToYourShoppingCart() {
        Reporter.log("get text from product has been added to your shopping cart" + productAddedMessage.toString());
        return getTextFromElement(productAddedMessage);
    }

    public void closeTheBarByClickingOnCrossButton() {
        Reporter.log("close the bar by clicking on cross button" + closingBarButton.toString());
        clickOnElement(closingBarButton);
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("mouse hover on shopping cart" + shoppingCartOption.toString());
        mouseHoverToElementAndClick(shoppingCartOption);
    }

}
