package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindShortestSubArrayTest {

    private final FindShortestSubArray subArray = new FindShortestSubArray();

    @Test
    public void should_return_the_shortest_sub_array() {
        int[] nums = new int[]{1, 2, 2, 3, 1, 4, 2};
        int result = subArray.findShortestSubArray(nums);
        assertEquals(6, result);
    }
}
