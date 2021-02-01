package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSumTwoNoOverlapTest {

    private final MaxSumTwoNoOverlap overlap = new MaxSumTwoNoOverlap();

    @Test
    public void should_return_the_max_sum_two_no_overlap() {
        int[] a = {0, 6, 5, 2, 2, 5, 1, 9, 4};
        int result = overlap.maxSumTwoNoOverlap(a, 1, 2);
        assertEquals(20, result);
    }
}
