package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnesTest {

    private final FindMaxConsecutiveOnes ones = new FindMaxConsecutiveOnes();

    @Test
    public void should_return_the_max_count() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        int result = ones.findMaxConsecutiveOnes(nums);
        assertEquals(3, result);
    }
}
