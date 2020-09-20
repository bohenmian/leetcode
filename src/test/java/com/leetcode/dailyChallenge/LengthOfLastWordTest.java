package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    private final LengthOfLastWord word = new LengthOfLastWord();

    @Test
    public void should_return_the_last_word_length() {
        String s = "Hello World";
        int result = word.lengthOfLastWord(s);
        assertEquals(5, result);
    }

    @Test
    public void should_return_the_last_word_length_when_last_contain_space() {
        String s = "Hello World ";
        int result = word.lengthOfLastWord(s);
        assertEquals(5, result);
    }
}
