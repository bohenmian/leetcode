package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostToMoveChipsTest {

    private final MinCostToMoveChips costToMoveChips = new MinCostToMoveChips();

    @Test
    public void should_return_the_cost_to_move() {
        int result = costToMoveChips.minCostToMoveChips(new int[]{2, 2, 2, 3, 3});
        assertEquals(2, result);
    }
}
