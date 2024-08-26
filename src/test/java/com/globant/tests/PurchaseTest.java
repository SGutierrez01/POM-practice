package com.globant.tests;

import com.globant.pages.*;
import com.globant.utils.data.CheckoutDataProvider;
import com.globant.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

        @Test(groups = {"purchase"} , dataProvider = "checkoutData", dataProviderClass = CheckoutDataProvider.class)
        public void testPurchaseProduct(String firstName, String lastName, String postalCode){
            CatalogPage catalogPage = getCatalogPage();
            catalogPage.clickProductBtn((int) (Math.random() * catalogPage.getProductsCount()));

            CartPage cartPage = catalogPage.clickCartBtn();
            Assert.assertEquals(cartPage.getTitle(), "Your Cart");
            Assert.assertTrue(cartPage.isCartPageDisplayed());
            Assert.assertTrue(cartPage.isItemIntoCartDisplayed());

            CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutBtn();
            Assert.assertEquals(checkoutInformationPage.getTitle(), "Checkout: Your Information");
            Assert.assertTrue(checkoutInformationPage.isCheckoutInformationPageDisplayed());

            checkoutInformationPage.setFirstName(firstName);
            checkoutInformationPage.setLastName(lastName);
            checkoutInformationPage.setPostalCode(postalCode);

            CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage.clickContinueBtn();
            Assert.assertEquals(checkoutOverviewPage.getTitle(), "Checkout: Overview");
            Assert.assertTrue(checkoutOverviewPage.isCheckoutOverviewPageDisplayed());

            CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.clickFinishBtn();
            Assert.assertTrue(checkoutCompletePage.isCompleteMessageDisplayed());
            Assert.assertEquals(checkoutCompletePage.getCompleteMessage(), "Thank you for your order!");

        }
}
