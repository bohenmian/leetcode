package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestOverlapTest {

    private final LargestOverlap overlap = new LargestOverlap();

    @Test
    public void should_return_the_largest_overlap() {
        int[][] A = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] B = new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        int result = overlap.largestOverlap(A, B);
        assertEquals(3, result);
    }
}
