package com.globant.tests;

import com.globant.pages.CatalogPage;
import com.globant.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @BeforeMethod
    @Parameters({"username", "password", "url"})
    public CatalogPage login(String username, String password, String url){
        LoginPage loginPage = new LoginPage(this.driver, url);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        return loginPage.clickLoginButton();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public CatalogPage getCatalogPage(){
        return new CatalogPage(driver);
    }
}
