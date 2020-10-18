package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxAverageTest {

    private final FindMaxAverage average = new FindMaxAverage();

    @Test
    public void should_return_the_max_average() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        double result = average.findMaxAverage(nums, 4);
        assertEquals(12.75, result, 2);
    }
}
