package com.nopcommerce.pages.electronics;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CellPhonesListViewPage extends Utility {
    public CellPhonesListViewPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']")
    WebElement nokiaLumia1020;


    public void clickOnNokiaLumiaLink() {
        Reporter.log("Click on nokialumia 1020" + nokiaLumia1020.toString());
        //driver.navigate().refresh();

        try {
            clickOnElement(nokiaLumia1020);
        } catch (
                StaleElementReferenceException e) {
            clickOnElement(By.xpath("//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']"));
        }

    }


}
