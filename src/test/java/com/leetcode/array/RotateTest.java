package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateTest {

    private final Rotate rotate = new Rotate();

    @Test
    public void should_return_the_rotate_array() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] result = this.rotate.rotate(nums, 3);
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }
}
