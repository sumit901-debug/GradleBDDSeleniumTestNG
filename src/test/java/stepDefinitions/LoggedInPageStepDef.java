package stepDefinitions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.LoggedInPageTest;
import utility.BrowserDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.ExtentReportManager;

import java.time.Duration;

public class LoggedInPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private LoggedInPageTest loggedInPage;

    @Test
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {

        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loggedInPage = new LoggedInPageTest(driver);
        Thread.sleep(5000);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", loggedInPage.visibility_productcategory_formalshoes());

        String actualproductcategory_fs  = loggedInPage.visibility_productcategory_formalshoes().getText();
        Assert.assertEquals("Formal Shoes",actualproductcategory_fs);
        ExtentReportManager.getInstance().createTest("Formal Shoes Visible").log(Status.PASS, "Formal Shoes category is visible");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", loggedInPage.visibility_productcategory_sportsshoes());
        String actualproductcategory_ss= loggedInPage.visibility_productcategory_sportsshoes().getText();
        ExtentReportManager.getInstance().createTest("Sports Shoes Visible").log(Status.PASS, "Sports category is visible");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals("Sports",actualproductcategory_ss);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", loggedInPage.visibility_productcategory_sneakershoes());
        String actualproductcategory_s = loggedInPage.visibility_productcategory_sneakershoes().getText();
        ExtentReportManager.getInstance().createTest("Sneakers Visible").log(Status.PASS, "Sneakers category is visible");
        Assert.assertEquals("Sneakers",actualproductcategory_s);

    }
}
