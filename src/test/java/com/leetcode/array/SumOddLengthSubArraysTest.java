package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOddLengthSubArraysTest {

    private final SumOddLengthSubArrays arrays = new SumOddLengthSubArrays();

    @Test
    public void should_return_the_sum_odd_length_sub_array() {
        int[] arr = {1, 4, 2, 5, 3};
        int result = arrays.sumOddLengthSubArrays(arr);
        assertEquals(58, result);
    }
}
