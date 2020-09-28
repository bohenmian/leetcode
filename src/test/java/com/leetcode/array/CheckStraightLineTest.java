package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckStraightLineTest {

    private final CheckStraightLine line = new CheckStraightLine();

    @Test
    public void should_check_straight_line() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean result = line.checkStraightLine(coordinates);
        assertTrue(result);
    }
}
