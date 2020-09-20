package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordPatternTest {

    private final WordPattern wordPattern = new WordPattern();

    @Test
    public void should_return_true_when_patten_match_str() {
        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean result = wordPattern.wordPattern(pattern, str);
        assertTrue(result);
    }
}
