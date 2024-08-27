package com.globant.pages;

import com.globant.utils.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement title;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;


    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        isElementDisplayed(title);
        return title.getText();
    }

    public CheckoutCompletePage clickFinishBtn(){
        isElementDisplayed(finishBtn);
        finishBtn.click();
        return new CheckoutCompletePage(super.driver);
    }

    public boolean isCheckoutOverviewPageDisplayed() {
        return isElementDisplayed(title) && isElementDisplayed(finishBtn);
    }

}
