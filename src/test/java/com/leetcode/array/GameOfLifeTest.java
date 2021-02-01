package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeTest {

    private final GameOfLife life = new GameOfLife();

    @Test
    public void should_return_the_game_of_life_next_state() {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        life.gameOfLife(board);
    }
}
