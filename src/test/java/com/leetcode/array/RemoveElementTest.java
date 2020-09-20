package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void should_return_the_new_array_length() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int result = removeElement.removeElement(nums, 2);
        assertEquals(5, result);
    }
}
