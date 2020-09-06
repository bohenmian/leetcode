package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixReshapeTest {

    private final MatrixReshape reshape = new MatrixReshape();

    @Test
    public void should_return_the_matrix() {
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        int[][] result = reshape.matrixReshape(nums, 1, 4);
        int[][] expected = new int[][]{{1, 2, 3, 4}};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_the_reshape_matrix() {
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        int[][] result = reshape.matrixReshape(nums, 2, 4);
        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        assertArrayEquals(expected, result);
    }
}
