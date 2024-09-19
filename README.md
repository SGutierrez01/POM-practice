# POM Practice Project

This project demonstrates the use of the Page Object Model (POM) design pattern in Selenium with TestNG for automated testing of a web application.

## Project Structure

- **src/test/java/com/globant/pages**: Contains all page classes, representing the various pages of the application.
- **src/test/java/com/globant/tests**: Contains all test classes, extending the base test class for reusability.
- **src/test/java/com/globant/utils**:
  - **data**: Contains DataProviders for supplying test data.
  - **drivers**: Contains WebDriver management classes.
  - **pages**: Contains base pages class.
  - **tests**: Contains base tests class.  
- **src/test/resources**: Contains the `suite.xml` file used to run all tests.

## Technologies Used

- **Selenium WebDriver**: For browser automation.
- **TestNG**: For managing test cases and providing annotations.
- **WebDriverManager**: For managing browser drivers.

## Tests and Objectives

- **PurchaseTest**: Tests the complete purchase flow, ensuring that items can be added to the cart and the checkout process works correctly.
- **RemoveItemsTest**: Verifies that items can be successfully removed from the cart.
- **LogoutTest**: Ensures that users can log out and that no active session remains after logout.

## How to Run

All tests are executed via the `suite.xml` file located in the `resources` directory. Simply run this file to execute the test suite.

---

**Author**: Santiago Gutiérrez  
**Date**: September 2024
