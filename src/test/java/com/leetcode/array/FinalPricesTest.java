package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FinalPricesTest {

    private final FinalPrices price = new FinalPrices();

    @Test
    public void should_return_the_final_price() {
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] finalPrices = price.finalPrices(prices);
        int[] expected = {4, 2, 4, 2, 3};
        assertArrayEquals(expected, finalPrices);
    }
}
