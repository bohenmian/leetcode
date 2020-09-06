package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RunningSumTest {


    private final RunningSum sum = new RunningSum();

    @Test
    public void should_return_the_new_running_sum() {
        int[] numbers = {1, 2, 3, 4};
        int[] result = this.sum.runningSum(numbers);
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, result);
    }
}
