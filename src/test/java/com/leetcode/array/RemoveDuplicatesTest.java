package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates duplicates = new RemoveDuplicates();

    @Test
    public void should_remove_the_duplicate_and_return_the_length_of_array() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = duplicates.removeDuplicates(nums);
        assertEquals(5, result);
    }
}
