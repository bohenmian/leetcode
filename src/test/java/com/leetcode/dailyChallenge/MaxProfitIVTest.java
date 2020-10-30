package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitIVTest {

    private final MaxProfitIV maxProfitIV = new MaxProfitIV();

    @Test
    public void should_return_the_max_profit() {
        int[] prices = {3, 2, 6, 5, 0, 3};
        int result = maxProfitIV.maxProfitOtherWay(2, prices);
        assertEquals(7, result);
    }
}
