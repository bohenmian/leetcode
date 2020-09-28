package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumEquivDominoPairsTest {

    private final NumEquivDominoPairs pairs = new NumEquivDominoPairs();

    @Test
    public void should_return_the_number_equiv_domino_pairs() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int result = pairs.numEquivDominoPairs(dominoes);
        assertEquals(1, result);
    }

    @Test
    public void should_return_the_number_equiv_domino_pairs_other_way() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {4, 3}};
        int result = pairs.numEquivDominoPairsOtherWay(dominoes);
        assertEquals(2, result);
    }
}
