package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetHintTest {

    private final GetHint hint = new GetHint();

    @Test
    public void should_return_the_hint() {
        String secret = "1123";
        String guess = "0111";
        String result = hint.getHint(secret, guess);
        assertEquals("1A1B", result);
    }

    @Test
    public void should_get_the_hit() {
        String secret = "1123";
        String guess = "0111";
        String result = hint.getHintInOtherWay(secret, guess);
        assertEquals("1A1B", result);
    }
}
