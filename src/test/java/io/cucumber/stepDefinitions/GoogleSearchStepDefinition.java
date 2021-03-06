/*
Demonstrate how webdriver works
 */

package io.cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.webDriverFactory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDefinition {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        driver = WebDriverFactory.createWebDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("user is on google search page {string}")
    public void user_is_on_google_search_page(String url) {
        driver.navigate().to(url);
    }

    @When("user enters {string} in google search box")
    public void user_enters_a_text_in_google_search_box(String searchText) {
        driver.findElement(By.name("q")).sendKeys(searchText);
    }

    @When("hits Enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to the search results page {string}")
    public void user_is_navigated_to_the_search_results_page(String searchResult) {
        assertTrue(driver.getPageSource().contains(searchResult));
        driver.close();
        driver.quit();
    }
}
