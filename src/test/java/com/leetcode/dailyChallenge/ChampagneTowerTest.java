package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampagneTowerTest {

    private final ChampagneTower tower = new ChampagneTower();

    @Test
    public void should_return_the_champagne_tower() {
        double result = tower.champagneTower(2, 1, 1);
        assertEquals(0.5, result, 2);
    }
}
