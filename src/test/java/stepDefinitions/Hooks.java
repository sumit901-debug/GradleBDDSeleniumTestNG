package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.BrowserDriver;
import utility.ExtentReportManager;

public class Hooks {

    private static ExtentReports extent = ExtentReportManager.getInstance();
    private static ThreadLocal<ExtentTest> featureTest = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> scenarioTest = new ThreadLocal<>();
    private ExtentTest feature;
    private ExtentTest scenario;

    @Before(order = 0)
    public void setUp() {
        // Initialize WebDriver
        BrowserDriver.initializeDriver();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentTest feature = extent.createTest(scenario.getSourceTagNames().toString());
        featureTest.set(feature);
        ExtentTest scenarioNode = featureTest.get().createNode(scenario.getName());
        scenarioTest.set(scenarioNode);
    }

//    @BeforeStep
//    public void beforeScenario(io.cucumber.java.Scenario scenarioObj) {
//        feature = extent.createTest(scenarioObj.getSourceTagNames().toString());
//        scenario = feature.createNode(scenarioObj.getName());
//        System.out.println("--- Scenario Started: " + scenarioObj.getName() + " ---");
//    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        scenarioTest.get().info("Starting step: " + scenario.getName());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            scenarioTest.get().fail("Step failed");
        } else {
            scenarioTest.get().pass("Step passed");
        }
    }

//    @AfterStep
//    public void afterScenario(io.cucumber.java.Scenario scenarioObj) {
//        if (scenarioObj.isFailed()) {
//            scenario.fail("Scenario failed");
//        } else {
//            scenario.pass("Scenario passed");
//        }
////        extent.flush();
//        System.out.println("--- Scenario Completed: " + scenarioObj.getName() + " ---");
//    }


    @After(order = 1)
    public static void tearDown() {
        // Quit WebDriver after test
        BrowserDriver.quitDriver();
    }

    @After(order = 0)
    public void afterScenario() {
        extent.flush();
    }

}
