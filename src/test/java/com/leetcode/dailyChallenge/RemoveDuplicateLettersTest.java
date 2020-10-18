package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateLettersTest {

    private final RemoveDuplicateLetters letters = new RemoveDuplicateLetters();

    @Test
    public void should_remove_the_duplicate_letters() {
        String result = letters.removeDuplicateLetters("abacb");
        assertEquals("abc", result);
    }
}
