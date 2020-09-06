package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    private final ReplaceElementsWithGreatestElementOnRightSide rightSide = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void should_return_new_array() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] result = rightSide.replaceElements(arr);
        int[] expected = {18, 6, 6, 6, 1, -1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_new_array_in_other_way() {
        int[] arr = new int[]{17, 18, 5, 9, 6, 1};
        int[] result = rightSide.replaceElements(arr);
        int[] expected = {18, 9, 9, 6, 1, -1};
        assertArrayEquals(expected, result);
    }
}
