package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsRobotBoundedTest {

    private final IsRobotBounded bounded = new IsRobotBounded();

    @Test
    public void should_return_the_robot_bounded() {
        boolean result = bounded.isRobotBounded("GGLLGG");
        assertTrue(result);
    }
}
