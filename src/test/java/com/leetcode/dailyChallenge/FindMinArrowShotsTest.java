package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinArrowShotsTest {

    private final FindMinArrowShots shots = new FindMinArrowShots();

    @Test
    public void should_return_the_min_arrow_shots() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int result = shots.findMinArrowShots(points);
        assertEquals(2, result);
    }
}
