package com.globant.tests;

import com.globant.pages.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

        @Test
        @Parameters({"firstName", "lastName", "postalCode"})
        public void testPurchaseProduct(String firstName, String lastName, String postalCode){
            CatalogPage catalogPage = getCatalogPage();
            catalogPage.clickProductBtn((int) (Math.random() * catalogPage.getProductsCount()));
            CartPage cartPage = catalogPage.clickCartBtn();
            CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutBtn();
            checkoutInformationPage.setFirstName(firstName);
            checkoutInformationPage.setLastName(lastName);
            checkoutInformationPage.setPostalCode(postalCode);
            CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage.clickContinueBtn();
            CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.clickFinishBtn();
            Assert.assertTrue(checkoutCompletePage.isCompleteMessageDisplayed());
            Assert.assertEquals(checkoutCompletePage.getCompleteMessage(), "Thank you for your order!");

        }
}
