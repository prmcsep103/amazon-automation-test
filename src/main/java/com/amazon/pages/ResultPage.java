package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Jay
 */
public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']//h2/a/span")
    List<WebElement> resultLinks;
    @CacheLookup
    @FindBy(xpath = "//a[starts-with(@aria-label, 'Go to next page')]")
    WebElement nextButton;

    public void pickTheProductFromList(String productName) {
        boolean trigger = true;
        while (trigger) {
            try {
                for (WebElement product : resultLinks) {
                    if (product.getText().contains(productName)) {
                        product.click();
                        trigger = false;
                        break;
                    }
                }
                if (!trigger) {
                    break;
                }
                clickOnElement(nextButton);
                PageFactory.initElements(driver, this);
            } catch (StaleElementReferenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
