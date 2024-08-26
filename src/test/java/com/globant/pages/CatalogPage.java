package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CatalogPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'inventory_item')]//button[contains(@class, 'btn_inventory')]")
    private List<WebElement> productsBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement cartBtn;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductBtn(int index){
        isElementDisplayed(productsBtn.get(index));
        productsBtn.get(index).click();
    }

    public CartPage clickCartBtn(){
        isElementDisplayed(cartBtn);
        cartBtn.click();
        return new CartPage(super.driver);
    }

    public int getProductsCount(){
        return productsBtn.size();
    }

}
