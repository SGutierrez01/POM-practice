package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//div[contains(@class, 'cart_list')]//button[contains(@class, 'cart_button')]")
    private List<WebElement> itemsRemoveBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformationPage clickCheckoutBtn(){
        isElementDisplayed(checkoutBtn);
        checkoutBtn.click();
        return new CheckoutInformationPage(super.driver);
    }

    public void removeItems(int index){
        isElementDisplayed(itemsRemoveBtn.get(index));
        itemsRemoveBtn.get(index).click();
    }

    public int getItemsCount(){
        return itemsRemoveBtn.size();
    }
}
