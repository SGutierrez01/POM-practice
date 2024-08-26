package com.globant.pages;

import com.globant.utils.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement completeMessageTxt;

    @FindBy(id = "back-to-products")
    private WebElement backToProductsBtn;

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

    public CatalogPage clickBackToProductsBtn(){
        isElementDisplayed(backToProductsBtn);
        backToProductsBtn.click();
        return new CatalogPage(super.driver);
    }
}
