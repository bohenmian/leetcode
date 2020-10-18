package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobTest {

    private final Rob rob = new Rob();

    @Test
    public void should_return_the_rob() {
        int[] nums = {2, 7, 9, 3, 1};
        int result = rob.robInDp(nums);
        assertEquals(12, result);
    }
}
