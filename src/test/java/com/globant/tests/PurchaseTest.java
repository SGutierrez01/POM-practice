package com.globant.tests;

import com.globant.pages.CartPage;
import com.globant.pages.CatalogPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

        @Test
        public void testPurchaseProduct(){
            CatalogPage catalogPage = getCatalogPage();
            catalogPage.clickProductBtn((int) (Math.random() * catalogPage.getProductsCount()));
            CartPage cartPage = catalogPage.clickCartBtn();
            cartPage.clickCheckoutBtn();
        }
}
