package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNUniqueIntegersSumUpToZeroTest {

    private final FindNUniqueIntegersSumUpToZero sumUp = new FindNUniqueIntegersSumUpToZero();

    @Test
    public void should_return_the_unique_integers_sum_up_to_zero() {
        int[] result = sumUp.sumZero(5);
        int[] expected = {-4, -2, 0, 2, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_the_unique_integers_sum_up_to_zero_in_other_test_case() {
        int[] result = sumUp.sumZeroInOtherWay(3);
        int[] expected = {-2, 0, 2};
        assertArrayEquals(expected,   result);
    }
}
