package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DuplicateZerosTest {

    private final DuplicateZeros zeros = new DuplicateZeros();

    @Test
    public void should_duplicate_zero() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] result = zeros.duplicateZeros(arr);
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        assertArrayEquals(expected, result);
    }
}
