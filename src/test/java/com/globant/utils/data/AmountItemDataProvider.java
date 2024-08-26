package com.globant.utils.data;

import org.testng.annotations.DataProvider;

public class AmountItemDataProvider {
    @DataProvider(name = "amountData")
    public static Object[][] amountData() {
        return new Object[][] {
                {1},
                {2},
                {3},
                {4},
                {5}
        };
    }
}
