package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

    private final MaxProfit profit = new MaxProfit();

    @Test
    public void should_return_the_max_profit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = profit.maxProfit(prices);
        assertEquals(7, result);
    }

    @Test
    public void should_return_the_max_profit_other_way() {
        int[] prices = {1, 2, 3, 4, 5};
        int result = profit.maxProfitInOtherWay(prices);
        assertEquals(4, result);
    }
}
