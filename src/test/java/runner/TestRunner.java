package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


        @CucumberOptions(
        features = "src/test/resources/LoggedIn.feature",
        glue = {"StepDefinitions"},
        plugin = {
                "pretty",                                  // Console output
                "html:target/cucumber-reports/report.html", // HTML report
                "json:target/cucumber-reports/report.json", // JSON report

        }
)

public class TestRunner extends AbstractTestNGCucumberTests {



}