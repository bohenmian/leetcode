package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestTest {

    private final KthSmallest smallest = new KthSmallest();

    @Test
    public void should_return_the_k_smallest_number() {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int result = smallest.kthSmallest(matrix, 8);
        assertEquals(13, result);
    }
}
