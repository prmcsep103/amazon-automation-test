package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;

    @CacheLookup
    @FindBy(xpath = "//li[starts-with(@id,'p_n_feature_thirty-three')]/span/a")
    List<WebElement> ramList;

    public void enterProductNameToSearchBox(String productName) {
        searchbox.clear();
        sendTextToElement(searchbox, productName);
    }

    public void clickOnSearchBox() {
        sendTextToElement(searchbox, Keys.ENTER);
    }

    public void selectRamOptions(String options) {
        try {
            for (WebElement ram : ramList) {
                if (ram.getText().contains(options)) {
                    clickOnElement(ram);
                    break;
                }
            }
            Thread.sleep(4000);
        } catch (StaleElementReferenceException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
