package pages;

import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest extends BrowserDriver {

    private final WebDriver driver;

    private final By username_text_id = By.id("usr");
    private final By password_text_id = By.id("pwd");
    private final By login_btn_xpath = By.xpath( "//*[@id=\"second_form\"]/input");
    private final By newregister_btn_id =By.id("NewRegistration");

    // Constructor to pass WebDriver
    public LoginPageTest(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement sendkeys_username() throws InterruptedException {

        return driver.findElement(username_text_id);
    }

    public WebElement sendkeys_password() throws InterruptedException {

        return driver.findElement(password_text_id);
    }

    public WebElement click_login_btn()
    {
        return driver.findElement(login_btn_xpath);
    }

    public WebElement click_NewRegister_btn()
    {
        return driver.findElement(newregister_btn_id);
    }

}
