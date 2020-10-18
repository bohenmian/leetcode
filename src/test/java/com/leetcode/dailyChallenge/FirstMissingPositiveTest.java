package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveTest {

    private final FirstMissingPositive positive = new FirstMissingPositive();

    @Test
    public void should_first_missing_positive_number() {
        int[] nums = {3, 4, -1, 1};
        int result = positive.firstMissingPositive(nums);
        assertEquals(2, result);
    }
}
