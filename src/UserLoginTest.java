import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginTest {

    public static void main(String[] args) {
        // This line is a comment, indicating you can use a different webdriver if needed
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thein\\OneDrive\\Desktop\\QA\\SQA109 Software Test Automation Level 1 - 0124\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");

        // This line sets the path to your ChromeDriver executable
        WebDriver driver = new ChromeDriver();

        // Create a UserloginPage object using the current driver instance
        UserLoginPage loginPage = new UserLoginPage(driver);

        loginPage.navigateToLoginPage(driver);

        // Click on the register button to open the registration form

        //loginPage.clickLoginButton(driver);

        //Define unique username and email for registration (replace with your own values)
        String username = "test_user";
        String password = "test_password";

        // Enter the username in the username field using the page object method
        loginPage.enterUsername(username);

        // Enter the email address in the email field using the page object method
        loginPage.enterPassword(password);

        // Basic assertion to verify successful registration (replace with more robust checks)
        /*String title = driver.getTitle();
        if (title.contains("Registration successful")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed! Title: " + title);
        }*/

        // Quit the browser driver
        driver.quit();
    }
}