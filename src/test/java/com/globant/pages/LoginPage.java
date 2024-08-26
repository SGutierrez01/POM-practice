package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    public void setUsername(String username){
        isElementDisplayed(usernameInput);
        usernameInput.sendKeys(username);
    }
}
