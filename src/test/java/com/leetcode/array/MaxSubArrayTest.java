package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubArrayTest {

    private final MaxSubArray array = new MaxSubArray();

    @Test
    public void should_return_the_max_sub_array() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = array.maxSubArray(nums);
        assertEquals(6, result);
    }
}
