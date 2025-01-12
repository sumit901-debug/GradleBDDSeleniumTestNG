package StepDefinitions;

import Pages.HomePage;
import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageStepDef extends BrowserDriver {

    private WebDriver driver;
    private HomePage homePage;

    @Test
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        driver = BrowserDriver.initializeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        homePage = new HomePage(driver);
        homePage.click_hamburger_manu().click();
        homePage.click_signIn_Link().click();

    }


}
