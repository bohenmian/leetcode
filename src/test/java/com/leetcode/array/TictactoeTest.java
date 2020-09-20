package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TictactoeTest {

    private final Tictactoe tictactoe = new Tictactoe();

    @Test
    public void should_return_the_winner() {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String result = this.tictactoe.tictactoe(moves);
        assertEquals("A", result);
    }

    @Test
    public void should_return_the_winner_other_way() {
        int[][] moves = {{1, 2}, {2, 1}, {1, 0}, {0, 0}, {0, 1}, {2, 0}, {1, 1}};
        String result = this.tictactoe.tictactoeOtherWay(moves);
        assertEquals("A", result);
    }
}
