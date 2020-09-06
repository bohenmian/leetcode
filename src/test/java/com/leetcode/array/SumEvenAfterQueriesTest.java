package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumEvenAfterQueriesTest {

    private final SumEvenAfterQueries sumEvenAfterQueries = new SumEvenAfterQueries();

    @Test
    public void should_return_the_new_array_after_queries() {
        int[] A = new int[]{-10, 2, -4, 5, -3, 3};
        int[][] queries = new int[][]{{-4, 2}, {9, 0}, {-8, 1}, {5, 4}, {1, 4}, {9, 0}};
        int[] expected = new int[]{-16, -6, -14, -12, -14, -6};
        int[] result = sumEvenAfterQueries.sumEvenAfterQueries(A, queries);
        assertArrayEquals(expected, result);
    }
}
