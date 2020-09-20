package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FairCandySwapTest {

    private final FairCandySwap swap = new FairCandySwap();

    @Test
    public void should_return_the_fair_candy() {
        int[] A = new int[]{1, 1};
        int[] B = new int[]{2, 2};
        int[] result = swap.fairCandySwap(A, B);
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }
}
