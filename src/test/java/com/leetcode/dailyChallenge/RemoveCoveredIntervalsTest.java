package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCoveredIntervalsTest {

    private final RemoveCoveredIntervals intervals = new RemoveCoveredIntervals();

    @Test
    public void should_return_the_remove_covered_intervals_length() {
        int[][] intervals = {{3, 10}, {4, 10}, {5, 11}};
        int result = this.intervals.removeCoveredIntervals(intervals);
        assertEquals(2, result);
    }


    @Test
    public void should_return_the_remove_covered_intervals_length_other_way() {
        int[][] intervals = {{1, 2}, {1, 4}, {3, 4}};
        int result = this.intervals.removeCoveredIntervalsOtherWay(intervals);
        assertEquals(1, result);
    }
}
