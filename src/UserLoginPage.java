import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage {

    private WebDriver driver;

    // Member variable to store the register button element
    @FindBy(id = "menuUserSVGPath")
    private WebElement loginButton;

    // Member variable to store the username input field element
    @FindBy(name = "username")
    private WebElement usernameInput;

    // Member variable to store the email input field element
    @FindBy(name = "password")
    private WebElement passwordInput;

    /**
     * Constructor to initialize the WebDriver instance
     * @param driver The WebDriver instance used to interact with the browser
     */
    public UserLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param driver
     */
    public void navigateToLoginPage(WebDriver driver) {
        // Navigate to the Advantage Online Shopping website homepage
        driver.get("https://www.advantageonlineshopping.com/#/");

        //WebElement loginPageLink = driver.findElement(By.id("menuUserSVGPath"));

        WebElement loginPageLink = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("menuUserSVGPath")));


        loginPageLink.click();

    }
    /**
     * Clicks on the register button element
     */
    /*public void clickLoginButton(WebDriver driver) {
       //registerButton.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
       loginButton.click();
    }*/

    /**
     * Enters a username in the username input field
     * @param username The username to be entered
     */
    public void enterUsername(String username) {
        WebElement usernameField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        usernameField.sendKeys(username);
    }

    /**
     * Enters an email address in the email input field
     * @param email The email address to be entered
     */
    public void enterPassword(String password) {
        // Wait for the password field to be present before entering text
        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        passwordField.sendKeys(password);
    }
}