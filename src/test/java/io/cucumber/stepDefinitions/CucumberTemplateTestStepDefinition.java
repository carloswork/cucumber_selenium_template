package io.cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTemplateTestStepDefinition {
    @Given("Test feature file is ready")
    public void test_feature_file_is_ready() {
        System.out.println("Given statement executed successfully.");
    }

    @When("I run the feature file")
    public void i_run_the_feature_file() {
        System.out.println("When statement executed successfully.");
    }

    @Then("Run should be successfully")
    public void run_should_be_successfully() {
        System.out.println("Then statement executed successfully.");
    }
}
