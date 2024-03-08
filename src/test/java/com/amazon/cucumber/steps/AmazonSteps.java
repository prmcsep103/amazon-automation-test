package com.amazon.cucumber.steps;

import com.amazon.pages.BasketPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import com.amazon.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Created by Jay
 */
public class AmazonSteps {
    @Given("^I am on amazon home page$")
    public void iAmOnAmazonHomePage() {
    }

    @When("^I search \"([^\"]*)\" in the search box$")
    public void iSearchInTheSearchBox(String productName) {
        new HomePage().enterProductNameToSearchBox(productName);

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new HomePage().clickOnSearchBox();
    }

    @And("^I click on \"([^\"]*)\" ram check box$")
    public void iClickOnRamRadioButton(String ram) {
        new HomePage().selectRamOptions(ram);
    }

    @And("^I select the product \"([^\"]*)\" from the list$")
    public void iSelectTheProductFromTheList(String product) {
        new ResultPage().pickTheProductFromList(product);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I should be able to see price \"([^\"]*)\"$")
    public void iShouldBeAbleToSeePrice(String price) {
        String actualPrice = new ProductPage().getActualPrice();
        Assert.assertEquals(price, actualPrice);
    }

    @And("^I add the \"([^\"]*)\" to the basket$")
    public void iAddTheToTheBasket(String product) throws InterruptedException {
        new ProductPage().clickOnAddToCart();
        Thread.sleep(5000);
        String actualText = new ProductPage().getAddedToCartText(product);
        Assert.assertEquals("Added to Cart", actualText);
        if (product.equals("laptop")){
            new ProductPage().clickOnCartButton();
        }
        Thread.sleep(1000);
    }

    @Then("^I should be able to see \"([^\"]*)\" added on basket successfully\\.$")
    public void iShouldBeAbleToSeeAddedOnBasketSuccessfully(String totalItems) {
        String actualTotal = new BasketPage().getTotalItem();
        Assert.assertTrue(actualTotal.contains(totalItems));
    }
}
