package StepDefinitions;

import Pages.LoginPage;
import Utility.BrowserDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private LoginPage loginPage;

    @Test
    @When("User successfully  enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {

        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loginPage = new LoginPage(driver);
        loginPage.sendkeys_username().sendKeys("Scott.gale@gmail.com");
        loginPage.sendkeys_password().sendKeys("P@sword!");
        loginPage.click_login_btn().click();


    }

}
