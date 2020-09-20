package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs climbingStairs = new MinCostClimbingStairs();

    @Test
    public void should_return_min_cost_climbing_stairs() {
        int result = climbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        assertEquals(6, result);
    }
}
