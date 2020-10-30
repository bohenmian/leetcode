package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSquaresTest {

    private final CountSquares countSquares = new CountSquares();

    @Test
    public void should_return_the_count_squares() {
        int[][] matrix = {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        int result = countSquares.countSquares(matrix);
        assertEquals(15, result);
    }
}
