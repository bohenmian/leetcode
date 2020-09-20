package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {

    private final ContainsDuplicate duplicate = new ContainsDuplicate();

    @Test
    public void should_return_true_if_the_element_is_distinct() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = duplicate.containsDuplicate(nums);
        assertTrue(result);
    }
}
