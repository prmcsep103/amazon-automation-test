package com.amazon.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay
 */
@CucumberOptions(
        features = "src/test/resources/featurefile",
        glue = "com/amazon/cucumber/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
