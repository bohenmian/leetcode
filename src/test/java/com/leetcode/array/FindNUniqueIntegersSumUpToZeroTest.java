package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNUniqueIntegersSumUpToZeroTest {

    private FindNUniqueIntegersSumUpToZero sumUp = new FindNUniqueIntegersSumUpToZero();

    @Test
    public void should_return_the_unique_integers_sum_up_to_zero() {
        int n = 5;
        int[] result = sumUp.sumZero(n);
        assertArrayEquals(new int[]{-4, -2, 0, 2, 4}, result);
    }

    @Test
    public void should_return_the_unique_integers_sum_up_to_zero_in_other_test_case() {
        int n = 3;
        int[] result = sumUp.sumZeroInOtherWay(n);
        assertArrayEquals(new int[]{-2, 0, 2},   result);
    }
}
