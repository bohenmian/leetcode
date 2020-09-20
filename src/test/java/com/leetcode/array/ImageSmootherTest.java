package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ImageSmootherTest {

    private final ImageSmoother smoother = new ImageSmoother();

    @Test
    public void should_return_the_image_smoother() {
        int[][] result = smoother.imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expected, result);
    }
}
