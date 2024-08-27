package com.globant.utils.data;

import org.testng.annotations.DataProvider;

public class CookieDataProvider {
    @DataProvider(name = "cookieData")
    public static Object[][] cookieData() {
        return new Object[][] {
                { "session-username" }
        };
    }
}
