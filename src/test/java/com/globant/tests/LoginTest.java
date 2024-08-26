package com.globant.tests;

import com.globant.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin(){
        LoginPage loginPage = getLoginPage();
        loginPage.setUsername("standard_user");
    }

}
