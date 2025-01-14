package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",   // HTML Report
                "json:target/cucumber.json",           // JSON Report

        },
        monochrome = true,
        dryRun = false,
        tags = "@Regression"
)


public class TestRunner extends AbstractTestNGCucumberTests {

}