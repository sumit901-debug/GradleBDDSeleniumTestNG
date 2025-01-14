package pages;

import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInPageTest extends BrowserDriver {

    private final WebDriver driver;

    private final By productcateogry_formalshoes = By.xpath( "//*[text()='Formal Shoes']");
    private final By productcateogry_sportsshoes = By.xpath("//*[text()='Sports']");
    private final By productcateogry_sneakers = By.xpath("//*[text()='Sneakers']");

    // Constructor to pass WebDriver
    public LoggedInPageTest(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement visibility_productcategory_formalshoes() throws InterruptedException {

        return driver.findElement(productcateogry_formalshoes);
    }

    public WebElement visibility_productcategory_sportsshoes() throws InterruptedException {

        return driver.findElement(productcateogry_sportsshoes);
    }

    public WebElement visibility_productcategory_sneakershoes() throws InterruptedException {

        return driver.findElement(productcateogry_sneakers);
    }

}
