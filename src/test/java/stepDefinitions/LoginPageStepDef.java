package stepDefinitions;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.LoginPageTest;
import utility.BrowserDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utility.ExtentReportManager;

public class LoginPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private LoginPageTest loginPage;

    @Test
    @When("User successfully  enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {

        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loginPage = new LoginPageTest(driver);
        loginPage.sendkeys_username().sendKeys("Scott.gale@gmail.com");
        ExtentReportManager.getInstance().createTest("Entered Username").log(Status.INFO, "Username entered");
        loginPage.sendkeys_password().sendKeys("P@sword!");
        ExtentReportManager.getInstance().createTest("Entered Password").log(Status.INFO, "Password entered");
        loginPage.click_login_btn().click();
        ExtentReportManager.getInstance().createTest("Clicked Login Button").log(Status.INFO, "Login button clicked");


    }

}
