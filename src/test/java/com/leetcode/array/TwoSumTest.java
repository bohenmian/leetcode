package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void should_return_the_index_of_two_number_sum_equal_target() {
        int[] number = new int[]{2, 7, 21, 23};
        int[] result = twoSum.twoSum(number, 9);
        int[] expected = {0, 1};
        assertArrayEquals(expected, result);
    }
}
