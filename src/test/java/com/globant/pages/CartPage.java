package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformationPage clickCheckoutBtn(){
        isElementDisplayed(checkoutBtn);
        checkoutBtn.click();
        return new CheckoutInformationPage(super.driver);
    }
}
