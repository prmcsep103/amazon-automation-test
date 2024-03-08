$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon search functionality",
  "description": "\r\nAs a user I want to search product on amazon and add to the shopping basket",
  "id": "amazon-search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6960490100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "validate amazon search functionality",
  "description": "",
  "id": "amazon-search-functionality;validate-amazon-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search \"Dell Laptop\" in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"4 GB\" ram check box",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the product \"2021 Newest HP 14 inch HD Laptop Computer\" from the list",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to see price \"$289.00\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I add the \"laptop\" to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I search \"monitor\" in the search box",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select the product \"Sceptre 27-Inch FHD LED Gaming Monitor\" from the list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I add the \"monitor\" to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to see \"2 items\" added on basket successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.iAmOnAmazonHomePage()"
});
formatter.result({
  "duration": 96149200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 10
    }
  ],
  "location": "AmazonSteps.iSearchInTheSearchBox(String)"
});
formatter.result({
  "duration": 134800000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSteps.iClickOnSearchButton()"
});
formatter.result({
  "duration": 2489420000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4 GB",
      "offset": 12
    }
  ],
  "location": "AmazonSteps.iClickOnRamRadioButton(String)"
});
formatter.result({
  "duration": 6448630100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2021 Newest HP 14 inch HD Laptop Computer",
      "offset": 22
    }
  ],
  "location": "AmazonSteps.iSelectTheProductFromTheList(String)"
});
formatter.result({
  "duration": 5038313600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$289.00",
      "offset": 31
    }
  ],
  "location": "AmazonSteps.iShouldBeAbleToSeePrice(String)"
});
formatter.result({
  "duration": 67212700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 11
    }
  ],
  "location": "AmazonSteps.iAddTheToTheBasket(String)"
});
formatter.result({
  "duration": 6319488500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monitor",
      "offset": 10
    }
  ],
  "location": "AmazonSteps.iSearchInTheSearchBox(String)"
});
formatter.result({
  "duration": 143915100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSteps.iClickOnSearchButton()"
});
formatter.result({
  "duration": 2102535300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sceptre 27-Inch FHD LED Gaming Monitor",
      "offset": 22
    }
  ],
  "location": "AmazonSteps.iSelectTheProductFromTheList(String)"
});
formatter.result({
  "duration": 4253692300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monitor",
      "offset": 11
    }
  ],
  "location": "AmazonSteps.iAddTheToTheBasket(String)"
});
formatter.result({
  "duration": 6183496900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 items",
      "offset": 25
    }
  ],
  "location": "AmazonSteps.iShouldBeAbleToSeeAddedOnBasketSuccessfully(String)"
});
formatter.result({
  "duration": 37578600,
  "status": "passed"
});
formatter.after({
  "duration": 113600,
  "status": "passed"
});
});