package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayRankTransformTest {

    private final ArrayRankTransform transform = new ArrayRankTransform();

    @Test
    public void should_return_the_transform_array() {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] result = transform.arrayRankTransform(arr);
        int[] expected = {5, 3, 4, 2, 8, 6, 7, 1, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_the_transform_array_other_way() {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] result = transform.arrayRankTransformOtherWay(arr);
        int[] expected = {5, 3, 4, 2, 8, 6, 7, 1, 3};
        assertArrayEquals(expected, result);
    }
}
