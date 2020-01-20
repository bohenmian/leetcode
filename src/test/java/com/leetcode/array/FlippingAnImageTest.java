package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlippingAnImageTest {

    private FlippingAnImage flippingAnImage = new FlippingAnImage();

    @Test
    public void should_return_a_new_image_when_flipping_an_image() {
        int[][] nums = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flippingAnImage.flipAndInvertImage(nums);
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}, result);
    }

    @Test
    public void should_return_a_new_image_when_flipping_an_image_in_other_test_case() {
        int[][] nums = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = flippingAnImage.flipAndInvertImage(nums);
        assertArrayEquals(new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}, result);
    }
}
