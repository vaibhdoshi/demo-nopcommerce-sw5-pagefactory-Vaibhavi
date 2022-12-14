package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(partialLinkText = "Computers")
    WebElement computersMenu;

    @CacheLookup
    @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToStoreMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;


    public void selectMenu(String menu) {
        List<WebElement> name = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li"));
        try {
            //System.out.println(name);
            for (WebElement name1 : name) {
                //System.out.println(name1);
                if (name1.getText().equalsIgnoreCase(menu)) {
                    name1.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            name = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li"));
        }

    }

    public void mousehoverOnDesktopLinkAndClick() {
        Reporter.log("mousehover on computers link and click" + desktopLink.toString());
        mouseHoverToElementAndClick(desktopLink);
    }

    public String getTextFromWelcomeToStore() {
        Reporter.log("get text from welcome store" + welcomeToStoreMessage.toString());
        return getTextFromElement(welcomeToStoreMessage);
    }


}


