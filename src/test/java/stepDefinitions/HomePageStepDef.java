package stepDefinitions;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.HomePageTest;
import utility.BrowserDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utility.ExtentReportManager;


public class HomePageStepDef extends BrowserDriver {

    private WebDriver driver;
    private HomePageTest homePage;

    @Test
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        driver = BrowserDriver.initializeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        homePage = new HomePageTest(driver);
        homePage.click_hamburger_manu().click();
        ExtentReportManager.getInstance().createTest("Clicked on Hamburger Menu").log(Status.INFO, "Hamburger Menu clicked");
        homePage.click_signIn_Link().click();
        ExtentReportManager.getInstance().createTest("Clicked on Sign In Link").log(Status.INFO, "Sign In link clicked");
//        getInstance().log(Status.INFO, "Navigated to Login Page");

    }


}
