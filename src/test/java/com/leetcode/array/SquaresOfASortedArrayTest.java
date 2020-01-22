package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresOfASortedArrayTest {

    private SquaresOfASortedArray array = new SquaresOfASortedArray();

    @Test
    public void should_return_a_sort_array() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] result = array.sortedSquares(nums);
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, result);
    }

    @Test
    public void should_return_a_sort_array_in_other_test_case() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = array.sortedSquaresInOtherWay(nums);
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, result);
    }
}
