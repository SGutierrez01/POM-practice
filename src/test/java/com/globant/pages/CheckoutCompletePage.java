package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement completeMessageTxt;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCompleteMessageDisplayed(){
        return isElementDisplayed(completeMessageTxt);
    }

    public String getCompleteMessage(){
        isElementDisplayed(completeMessageTxt);
        return completeMessageTxt.getText();
    }
}
