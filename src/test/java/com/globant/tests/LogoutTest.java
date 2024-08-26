package com.globant.tests;

import com.globant.pages.CatalogPage;
import com.globant.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        CatalogPage catalogPage = getCatalogPage();
        catalogPage.clickMenuBtn();
        LoginPage loginPage = catalogPage.clickLogoutBtn();
        Assert.assertTrue(loginPage.isLoginContentDisplayed());
    }
}
