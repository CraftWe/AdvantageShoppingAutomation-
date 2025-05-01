# Advantage Shopping Automation Project

This project was developed as part of a college-level Software Test Automation course to demonstrate the ability to automate user registration, login, and product search functionalities on the Advantage Shopping website (https://advantageonlineshopping.com/).

## Project Overview

This automation framework is built using Java, Selenium WebDriver, and TestNG. It simulates basic user interactions with the Advantage Shopping website to verify key functionalities.

**Key Features Automated:**

* **User Registration:** Automates the process of creating a new user account.
* **User Login:** Automates the process of logging in with an existing user account.
* **Product Search:** Automates the process of searching for a product.

## Technologies Used

* **Java:** Programming language used for writing the automation scripts.
* **Selenium WebDriver:** A browser automation tool used to interact with web elements.
* **TestNG:** A testing framework for Java that provides annotations for test management and execution.
* **ChromeDriver:** WebDriver implementation for the Chrome browser (you might have other browser drivers configured).

## Prerequisites

Before running this project, ensure you have the following installed:

* **Java Development Kit (JDK):** Make sure you have a compatible JDK installed on your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or an open-source distribution like [OpenJDK](https://openjdk.java.net/).
* **Maven:** This project is likely managed using Maven. Install Maven from [Apache Maven's website](https://maven.apache.org/download.cgi.html).
* **ChromeDriver:** Download the ChromeDriver executable compatible with your Chrome browser version and operating system. Place it in a location accessible by your system or update the `webdriver.chrome.driver` system property in your code. You can download it from the [ChromeDriver downloads page](https://chromedriver.chromium.org/downloads).

## Setup and Installation

1.  **Clone the Repository (if applicable):**
    ```bash
    git clone [your-github-repository-url]
    cd [your-repository-name]
    ```

2.  **Navigate to the Project Directory:**
    ```bash
    cd [your-project-directory]
    ```

3.  **Build the Project with Maven:**
    ```bash
    mvn clean install
    ```
    This command will download the necessary dependencies (Selenium and TestNG) and compile your project.

## Running the Tests

You can run the tests using TestNG through your IDE or via Maven.

**Using an IDE (e.g., IntelliJ IDEA, Eclipse):**

1.  Locate your TestNG test class (likely `AdvantageShoppingTest.java` or a similar name).
2.  Right-click on the class or within a test method.
3.  Select "Run As" -> "TestNG Test".

**Using Maven:**

1.  Navigate to the project's root directory in your terminal.
2.  Execute the following Maven command:
    ```bash
    mvn test
    ```
    Maven will execute all tests configured in your project.

## Test Case Details

The `AdvantageShoppingTest.java` (or your main test class) contains the following test steps:

1.  **Setup (`@BeforeMethod`):**
    * Configures the ChromeDriver and initializes the WebDriver instance.
    * Maximizes the browser window.
    * Navigates to the Advantage Shopping website.

2.  **`testUserRegistrationLoginAndSearch()` (`@Test`):**
    * Calls the `registerUser()` method to automate user registration.
    * Calls the `loginUser()` method to automate user login.
    * Calls the `searchForProduct()` method to automate product search.

3.  **`registerUser()`:**
    * Locates and interacts with elements on the registration page (e.g., username, email, password fields, register button).
    * Fills in registration details with predefined test data.
    * Clicks the registration button.
    * Includes basic verification (e.g., checking for a success message element). **Note:** Actual locators and verification logic need to be implemented.

4.  **`loginUser()`:**
    * Locates and interacts with elements on the login page (e.g., username, password fields, login button).
    * Enters predefined registered user credentials.
    * Clicks the login button.
    * Includes basic verification (e.g., checking for a logout button or user profile element). **Note:** Actual locators and verification logic need to be implemented.

5.  **`searchForProduct()`:**
    * Navigates to a product category (e.g., via a link or search bar).
    * Potentially enters a search term.
    * Verifies the presence of product search results. **Note:** Actual navigation steps, search terms, and verification logic need to be implemented.

6.  **Teardown (`@AfterMethod`):**
    * Closes the browser window and quits the WebDriver session after each test method.

## Known Issues and Limitations

* **Placeholder Locators:** The current code contains placeholder locators (e.g., `By.id("register_link")`). These need to be replaced with the actual locators identified on the Advantage Shopping website.
* **Basic Verification:** The verification steps implemented are basic (checking for the presence of an element). More robust assertions and data validation can be added.
* **Hardcoded Data:** Test data (e.g., username, password) is currently hardcoded in the script. Parameterization or data-driven testing techniques can be implemented for better test coverage.
* **Error Handling:** Basic error handling might be present, but more comprehensive error handling and reporting mechanisms can be added.
* **No Page Object Model (POM):** The project currently doesn't implement the Page Object Model design pattern. Implementing POM would improve code organization and maintainability.

## Challenges Faced

* Identifying reliable and unique locators for web elements on the Advantage Shopping website.
* Handling dynamic elements or asynchronous operations during automation.
* Implementing effective verification strategies to ensure the application behaves as expected.
* Setting up the testing environment and managing browser driver compatibility.

## Future Enhancements

* Implement the Page Object Model (POM) design pattern.
* Implement data-driven testing using external data sources.
* Add more comprehensive assertions and validation checks.
* Implement robust error handling and logging mechanisms.
* Explore cross-browser testing capabilities.
* Integrate with reporting tools for better test result visualization.

## Author

Cam A.
