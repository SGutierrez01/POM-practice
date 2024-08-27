package com.globant.tests;

import com.globant.pages.CatalogPage;
import com.globant.pages.LoginPage;
import com.globant.utils.data.CookieDataProvider;
import com.globant.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test(groups = {"logout"}, dataProvider = "cookieData", dataProviderClass = CookieDataProvider.class)
    public void testLogout(String cookie){
        CatalogPage catalogPage = getCatalogPage();
        Assert.assertTrue(catalogPage.isCatalogPageDisplayed());
        Assert.assertNotNull(catalogPage.getCookie("session-username"));

        catalogPage.clickMenuBtn();
        Assert.assertTrue(catalogPage.isMenuDisplayed());

        LoginPage loginPage = catalogPage.clickLogoutBtn();
        Assert.assertTrue(loginPage.isLoginContentDisplayed());
        Assert.assertNull(loginPage.getCookie(cookie));
    }
}
