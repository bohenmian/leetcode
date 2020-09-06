package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsNearbyAlmostDuplicateTest {

    private final ContainsNearbyAlmostDuplicate duplicate = new ContainsNearbyAlmostDuplicate();

    @Test
    public void should_return_true_when_exist() {
        int[] nums = {2,2};
        boolean isContains = duplicate.containsNearbyAlmostDuplicate(nums, 3, 0);
        assertTrue(isContains);
    }

    @Test
    public void should_return_true_when_exist_other_test_data() {
        int[] nums = {1, 0, 1, 1};
        boolean isContains = duplicate.containsNearbyAlmostDuplicate(nums, 1, 2);
        assertTrue(isContains);
    }

    @Test
    public void should_return_false_when_not_exist() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        boolean isContains = duplicate.containsNearbyAlmostDuplicate(nums, 2, 3);
        assertFalse(isContains);
    }
}
