package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiagonalSumTest {

    private final DiagonalSum sum = new DiagonalSum();

    @Test
    public void should_return_the_diagonal_sum() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = sum.diagonalSum(mat);
        assertEquals(25, result);
    }
}
