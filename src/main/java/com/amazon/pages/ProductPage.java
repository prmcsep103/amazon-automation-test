package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay
 */
public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(@class, 'priceToPay')]/span[2]/span")
    List<WebElement> priceLists;
    @CacheLookup
    @FindBy(xpath = "//input[starts-with(@id,'add-to-cart-button')]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addedToCartText;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"attachDisplayAddBaseAlert\"]/span")
    WebElement addedToCartTextMonitor;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"attach-close_sideSheet-link\"]")
    WebElement cartButton;

    public String getActualPrice() {
        String actualPrice = "";
        int count = 0;
        for (WebElement price : priceLists) {
            actualPrice += getTextFromElement(price);
            count++;
            if (count==2){
                actualPrice+=".";
            }
        }
        return actualPrice;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddedToCartText(String type) {

        String text;
        if (type.equalsIgnoreCase("laptop")){
            text = getTextFromElement(addedToCartTextMonitor);
        }else {
            text = getTextFromElement(addedToCartTextMonitor);
        }
        return text;
    }

    public void clickOnCartButton(){
        clickOnElement(cartButton);
    }

}
