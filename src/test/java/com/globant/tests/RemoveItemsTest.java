package com.globant.tests;

import com.globant.pages.CartPage;
import com.globant.pages.CatalogPage;
import com.globant.utils.data.AmountItemDataProvider;
import com.globant.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveItemsTest extends BaseTest {

    @Test(groups = {"remove"} , dataProvider = "amountData", dataProviderClass = AmountItemDataProvider.class)
    public void testCart(int amount){
        CatalogPage catalogPage = getCatalogPage();
        for (int i = 0; i < amount; i++){
            catalogPage.clickProductBtn(i);
        }
        CartPage cartPage = catalogPage.clickCartBtn();
        for (int i = amount-1; i >= 0; i--){
            cartPage.removeItems(i);
        }
        Assert.assertEquals(cartPage.getItemsCount(), 0);
    }
}
