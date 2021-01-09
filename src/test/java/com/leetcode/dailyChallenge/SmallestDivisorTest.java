package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestDivisorTest {

    private final SmallestDivisor divisor = new SmallestDivisor();

    @Test
    public void should_return_the_smallest_divisor() {
        int[] nums = {1, 2, 5, 9};
        int result = divisor.smallestDivisor(nums, 6);
        assertEquals(5, result);
    }
}
