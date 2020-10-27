package io.cucumber.testsetup;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        glue = {"io.cucumber.testsetup"},
        plugin = {"pretty",
                "junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports/report.html"})
public class RunCucumberTest {
}
