/*
Demonstrate how page object model (POM) works
 */

package io.cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.pages.loginPage;
import io.cucumber.pages.testFormPage;
import io.cucumber.webDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class TestProjectLoginStepDefinition {
    WebDriver driver = null;
    loginPage login = null;
    testFormPage testForm = null;

    @Given("browser is open for TestProject")
    public void browser_is_open_for_TestProject() {
        driver = WebDriverFactory.createWebDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String url) {
        driver.navigate().to(url);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {
        login = new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(3000);
    }

    @When("user clicks on login")
    public void user_clicks_on_login() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        testForm = new testFormPage(driver);
        assertTrue(testForm.btn_logout_isDisplayed());
    }
}
