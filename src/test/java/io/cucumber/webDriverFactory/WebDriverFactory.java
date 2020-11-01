package io.cucumber.webDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver createWebDriver(String broswer){
        switch(broswer) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/mac/geckodriver");
                return new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/mac/chromedriver");
                return new ChromeDriver();
            default:
                throw new RuntimeException("Unsupported webdriver: " + broswer);
        }
    }
}
