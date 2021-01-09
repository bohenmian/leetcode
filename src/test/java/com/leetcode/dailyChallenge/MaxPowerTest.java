package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxPowerTest {

    private final MaxPower maxPower = new MaxPower();

    @Test
    public void should_return_the_max_power() {
        int result = maxPower.maxPower("leetcode");
        assertEquals(2, result);

    }
}
