package com.globant.utils.data;

import org.testng.annotations.DataProvider;

public class CheckoutDataProvider {

    @DataProvider(name = "checkoutData")
    public static Object[][] checkoutData() {
        return new Object[][] {
                {"Santiago", "Gutierrez", "12345"},
                {"Maria", "Lopez", "67890"},
                {"Carlos", "Martinez", "11223"},
                {"Ana", "Gomez", "44556"},
                {"Pedro", "Ramirez", "77889"}
        };
    }
}
