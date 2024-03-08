package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class BasketPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"attach-accessory-cart-total-string\"]")
    WebElement totalItem;

    public String getTotalItem() {
        return getTextFromElement(totalItem);
    }
}
