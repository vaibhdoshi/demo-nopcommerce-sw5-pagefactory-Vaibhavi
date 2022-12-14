package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CellphoneListViewNokiaLumiaPage extends Utility {
    public CellphoneListViewNokiaLumiaPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020DisplayText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumia1020Price;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement nokiaLumia1020OldQuantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement nokiaLumiaAddToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement nokiaLumiaAddToCartGreenMessage;
    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement nokiaLumiaMessageClosingCrossButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement nokiaLumiaShoppingCartButton;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement nokiaLumiaShoppingCartButtonsGoToCartOption;


    public String getTextFromNokiaLumiaDisplayText() {
        Reporter.log("get text from nokia lumia text" + nokiaLumia1020DisplayText.toString());
        return getTextFromElement(nokiaLumia1020DisplayText);
    }


    public String getTextFromNokiaLumiaPrice() {
        Reporter.log("get text from nokia Lumia price" + nokiaLumia1020Price.toString());
        return getTextFromElement(nokiaLumia1020Price);
    }


    public void clearTheQuantityField() {
        clearTextFromField(By.id("product_enteredQuantity_20"));

    }

    public void UpdatedQuantityForNokiaLumia1020(String quantity) {
        Reporter.log("Updated quantity for nokia lumia1020" + nokiaLumia1020OldQuantity.toString());
        sendTextToElement(nokiaLumia1020OldQuantity, quantity);
    }

    public void clickOnNokiaLumiaAddToCartButton() {
        Reporter.log("click on Nokia lumia add to cart button" + nokiaLumiaAddToCartButton.toString());
        clickOnElement(nokiaLumiaAddToCartButton);
    }

    public String getProductAddedToCartMessage() {
        Reporter.log("get product added to cart message " + nokiaLumiaAddToCartGreenMessage.toString());
        return getTextFromElement(nokiaLumiaAddToCartGreenMessage);
    }

    public void closeTheGreenBarByClickingTheCrossButton() {
        Reporter.log("close the green bar by clicking the cross button" + nokiaLumiaMessageClosingCrossButton.toString());
        clickOnElement(nokiaLumiaMessageClosingCrossButton);
    }

    public void mouseHoverOnNokiaLumiaShoppingCartButton() {
        Reporter.log("Mouse hover on nokia lumia shopping cart button" + nokiaLumiaShoppingCartButton.toString());
        mouseHoverToElement(nokiaLumiaShoppingCartButton);
    }

    public void clickOnNokiaLumiaGoToCartButton() {
        Reporter.log("click on nokia lumia go to cart Button" + nokiaLumiaShoppingCartButtonsGoToCartOption.toString());
        clickOnElement(nokiaLumiaShoppingCartButtonsGoToCartOption);
    }

}
