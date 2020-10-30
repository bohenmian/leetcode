package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class WinnerSquareGameTest {

    private final WinnerSquareGame game = new WinnerSquareGame();

    @Test
    public void should_return_whether_winner_square_game() {
        boolean result = game.winnerSquareGame(17);
        assertFalse(result);
    }
}
