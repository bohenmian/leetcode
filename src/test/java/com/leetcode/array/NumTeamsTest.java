package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumTeamsTest {

    private final NumTeams teams = new NumTeams();

    @Test
    public void should_return_the_num_teams() {
        int[] rating = {2, 5, 3, 4, 1};
        int result = teams.numTeams(rating);
        assertEquals(3, result);
    }
}
