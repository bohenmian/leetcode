package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class KWeakestRowsTest {

    private final KWeakestRows kWeakestRows = new KWeakestRows();

    @Test
    public void should_return_the_k_weakest_row() {
        int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int[] result = kWeakestRows.kWeakestRows(mat, 3);
        int[] expected = {2, 0, 3};
        assertArrayEquals(expected, result);
    }
}
