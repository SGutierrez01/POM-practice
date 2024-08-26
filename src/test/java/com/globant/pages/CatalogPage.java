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

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menuBtn;

    @FindBy(css = "a#logout_sidebar_link")
    private WebElement logoutBtn;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductBtn(int index){
        isElementDisplayed(productsBtn.get(index));
        productsBtn.get(index).click();
    }

    public int getProductsCount(){
        return productsBtn.size();
    }

    public CartPage clickCartBtn(){
        isElementDisplayed(cartBtn);
        cartBtn.click();
        return new CartPage(super.driver);
    }

    public void clickMenuBtn(){
        isElementDisplayed(menuBtn);
        menuBtn.click();
    }

    public LoginPage clickLogoutBtn(){
        isElementDisplayed(logoutBtn);
        logoutBtn.click();
        return new LoginPage(super.driver, this.driver.getCurrentUrl());
    }

}
