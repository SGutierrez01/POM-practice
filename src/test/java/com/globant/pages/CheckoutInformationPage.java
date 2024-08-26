package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends BasePage {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String firstName){
        isElementDisplayed(firstNameInput);
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        isElementDisplayed(lastNameInput);
        lastNameInput.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode){
        isElementDisplayed(postalCodeInput);
        postalCodeInput.sendKeys(postalCode);
    }

    public CheckoutOverviewPage clickContinueBtn(){
        isElementDisplayed(continueBtn);
        continueBtn.click();
        return new CheckoutOverviewPage(super.driver);
    }
}
