package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinTimeToVisitAllPointsTest {

    private final MinTimeToVisitAllPoints time = new MinTimeToVisitAllPoints();

    @Test
    public void minTimeToVisitAllPoints() {
        int[][] points = {{3, 2}, {-2, 2}};
        int result = time.minTimeToVisitAllPoints(points);
        assertEquals(5, result);
    }

    @Test
    public void should_return_the_min_time_to_visit_all_points() {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        int result = time.minTimeToVisitAllPointsInOtherWays(points);
        assertEquals(7, result);
    }
}
