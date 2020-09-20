package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumIITest {

    private final TwoSumII twoSumII = new TwoSumII();

    @Test
    public void should_return_the_index_when_the_value_equals_the_target() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumII.twoSum(nums, target);
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }
}
