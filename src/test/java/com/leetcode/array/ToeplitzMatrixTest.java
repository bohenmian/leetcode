package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToeplitzMatrixTest {

    private final ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

    @Test
    public void should_return_is_the_toeplitz_matrix() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean result = toeplitzMatrix.isToeplitzMatrix(matrix);
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_matrix_is_not_toeplitz() {
        int[][] matrix = {{1, 2}, {2, 2}};
        boolean result = this.toeplitzMatrix.isToeplitzMatrix(matrix);
        assertFalse(result);
    }
}
