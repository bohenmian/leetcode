package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdMaxTest {

    private final ThirdMax max = new ThirdMax();

    @Test
    public void should_return_the_third_max_value() {
        int[] nums = {2, 2, 3, 1};
        int result = max.thirdMax(nums);
        assertEquals(1, result);
    }
}
