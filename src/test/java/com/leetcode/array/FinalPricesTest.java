package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FinalPricesTest {

    private FinalPrices price = new FinalPrices();

    @Test
    public void should_return_the_final_price() {
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] finalPrices = price.finalPrices(prices);
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, finalPrices);
    }
}
