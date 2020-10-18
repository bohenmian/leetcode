package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckPossibilityTest {

    private final CheckPossibility possibility = new CheckPossibility();

    @Test
    public void should_return_whether_check_possibility() {
        int[] nums = {3, 4, 2, 3};
        boolean result = possibility.checkPossibility(nums);
        assertTrue(result);
    }
}
