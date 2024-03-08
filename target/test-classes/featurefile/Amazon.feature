Feature: Amazon search functionality

  As a user I want to search product on amazon and add to the shopping basket

  @smoke
  Scenario: validate amazon search functionality
    Given I am on amazon home page
    When I search "Dell Laptop" in the search box
    And I click on search button
    And I click on "4 GB" ram check box
    And I select the product "2021 Newest HP 14 inch HD Laptop Computer" from the list
    Then I should be able to see price "$289.00"
    And I add the "laptop" to the basket
    And I search "monitor" in the search box
    And I click on search button
    And I select the product "Sceptre 27-Inch FHD LED Gaming Monitor" from the list
    And I add the "monitor" to the basket
    Then I should be able to see "2 items" added on basket successfully.

