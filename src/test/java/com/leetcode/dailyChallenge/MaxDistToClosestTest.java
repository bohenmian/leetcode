package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDistToClosestTest {

    private final MaxDistToClosest closest = new MaxDistToClosest();

    @Test
    public void should_return_the_max_dist_to_closest() {
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        int result = closest.maxDistToClosest(seats);
        assertEquals(2, result);
    }
}
