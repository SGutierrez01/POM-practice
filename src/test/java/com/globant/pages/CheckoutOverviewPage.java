package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;


    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePage clickFinishBtn(){
        isElementDisplayed(finishBtn);
        finishBtn.click();
        return new CheckoutCompletePage(super.driver);
    }
}
