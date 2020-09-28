package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    private final LargestNumber largestNumber = new LargestNumber();

    @Test
    public void should_return_the_largest_number() {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber.largestNumber(nums);
        assertEquals("9534330", result);
    }
}
