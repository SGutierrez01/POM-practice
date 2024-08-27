package com.globant.pages;

import com.globant.utils.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(css = "#password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    public void setUsername(String username){
        isElementDisplayed(usernameInput);
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password){
        isElementDisplayed(passwordInput);
        passwordInput.sendKeys(password);
    }

    public CatalogPage clickLoginButton(){
        isElementDisplayed(loginButton);
        loginButton.click();
        return new CatalogPage(super.driver);
    }

    public boolean isLoginContentDisplayed(){
        return isElementDisplayed(usernameInput) && isElementDisplayed(passwordInput) && isElementDisplayed(loginButton);
    }
}
