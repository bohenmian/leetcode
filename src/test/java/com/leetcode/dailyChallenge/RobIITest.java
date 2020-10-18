package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobIITest {

    private final RobII robII = new RobII();

    @Test
    public void should_return_the_max_rob_money() {
        int[] nums = {2, 3, 2};
        int result = robII.rob(nums);
        assertEquals(3, result);
    }
}
