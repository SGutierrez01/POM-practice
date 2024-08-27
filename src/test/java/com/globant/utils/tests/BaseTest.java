package com.globant.utils.tests;

import com.globant.pages.CatalogPage;
import com.globant.pages.LoginPage;
import com.globant.utils.drivers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        driver = WebDriverFactory.createDriver();
    }

    @BeforeMethod
    @Parameters({"username", "password", "url"})
    public CatalogPage login(String username, String password, String url){
        LoginPage loginPage = getLoginPage(url);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        return loginPage.clickLoginButton();
    }

    public LoginPage getLoginPage(String url){
        return new LoginPage(this.driver, url);
    }

    @AfterClass
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

    public CatalogPage getCatalogPage(){
        return new CatalogPage(driver);
    }
}
