package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement title;

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//div[contains(@class, 'cart_list')]//div[contains(@class, 'cart_item')]")
    private List<WebElement> itemsIntoCart;

    @FindBy(xpath = "//div[contains(@class, 'cart_list')]//button[contains(@class, 'cart_button')]")
    private List<WebElement> itemsRemoveBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        isElementDisplayed(title);
        return title.getText();
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

    public boolean isItemIntoCartDisplayed(){
        return isElementDisplayed(itemsIntoCart.get(0));
    }

    public boolean isCartPageDisplayed() {
        return isElementDisplayed(title) && isElementDisplayed(checkoutBtn);
    }
}
