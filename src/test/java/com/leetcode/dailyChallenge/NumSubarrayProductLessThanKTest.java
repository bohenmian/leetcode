package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumSubarrayProductLessThanKTest {

    private final NumSubarrayProductLessThanK thanK = new NumSubarrayProductLessThanK();

    @Test
    public void should_return_the_num_sub_array_product() {
        int[] nums = {10, 5, 2, 6};
        int result = thanK.numSubarrayProductLessThanK(nums, 100);
        assertEquals(8, result);
    }
}
