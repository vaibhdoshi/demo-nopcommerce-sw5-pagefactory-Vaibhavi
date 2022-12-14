package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCart;


    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
    }

    public void selectSortByOption(String option) {
        Reporter.log("select sort by option" + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,option);
    }

    public void clickOnAddToCart(){
        Reporter.log("click on add to cart" +addToCart.toString());
        mouseHoverToElementAndClick(addToCart);
    }
}
