package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagOfTokensScoreTest {

    private final BagOfTokensScore tokensScore = new BagOfTokensScore();

    @Test
    public void should_return_the_max_socre() {
        int[] tokens = {100, 200, 300, 400};
        int result = tokensScore.bagOfTokensScore(tokens, 200);
        assertEquals(2, result);
    }
}
