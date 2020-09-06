package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TransposeTest {

    private final Transpose transpose = new Transpose();

    @Test
    public void should_return_the_matrix() {
        int[][] matrix = transpose.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        int[][] expect = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(expect, matrix);
    }
}
