package com.globant.tests;

import com.globant.pages.CatalogPage;
import com.globant.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    private WebDriver driver = null;

    @BeforeSuite
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @BeforeTest
    @Parameters({"username", "password"})
    public CatalogPage testLogin(String username, String password){
        LoginPage loginPage = getLoginPage();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        return loginPage.clickLoginButton();
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver, "https://www.saucedemo.com/");
    }

    public CatalogPage getCatalogPage(){
        return new CatalogPage(driver);
    }
    /*@AfterTest
    public void afterTest(){
        driver.close();
    }*/
}
