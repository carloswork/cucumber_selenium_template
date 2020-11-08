/*
Demonstrate how page object model (POM) works
 */

package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testFormPage {
    WebDriver driver;
    private By btn_logout = By.id("logout");

    public testFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean btn_logout_isDisplayed() {
        return driver.findElement(btn_logout).isDisplayed();
    }
}
