package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ElectronicsCellPhonesPage extends Utility {
    public ElectronicsCellPhonesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Cell phones ']")
    WebElement cellPhones;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhonesPageText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;


    public void mouseHoverOnElectronicPageAndClick() {
        Reporter.log("Mousehover on Electronics " + electronics.toString());
        mouseHoverToElement(electronics);
        Reporter.log("Clicking on cellphones " + cellPhones.toString());
        mouseHoverToElementAndClick(cellPhones);
    }

    public String getCellPhonesPageWelcomeText() {
        Reporter.log("Get cellphonepage welcome text " + cellPhonesPageText.toString());
        return getTextFromElement(cellPhonesPageText);
    }

    public void clickOnTheListViewTab() {
        Reporter.log("Click on the list view tab " + listViewTab.toString());
        clickOnElement(listViewTab);
    }


}
