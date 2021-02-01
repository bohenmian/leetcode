package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubarrayTest {

    private final LongestSubarray subarray = new LongestSubarray();

    @Test
    public void should_return_the_longest_sub_array() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int result = subarray.longestSubarray(nums);
        assertEquals(5, result);
    }
}
