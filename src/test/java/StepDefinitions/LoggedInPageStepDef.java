package StepDefinitions;

import Pages.LoggedInPage;
import Utility.BrowserDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoggedInPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private LoggedInPage loggedInPage;

    @Test
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {

        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loggedInPage = new LoggedInPage(driver);
        Thread.sleep(5000);
        String actualproductcategory_fs  = loggedInPage.visibility_productcategory_formalshoes().getText();
//        assertEquals("Formal Shoes",actualproductcategory_fs);
        Assert.assertEquals("Formal Shoes",actualproductcategory_fs);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualproductcategory_ss= loggedInPage.visibility_productcategory_sportsshoes().getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        assertEquals("Sports",actualproductcategory_ss);
        Assert.assertEquals("Sports",actualproductcategory_ss);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualproductcategory_s = loggedInPage.visibility_productcategory_sneakershoes().getText();
//        assertEquals("Sneakers",actualproductcategory_s);
        Assert.assertEquals("Sneakers",actualproductcategory_s);

    }
}
