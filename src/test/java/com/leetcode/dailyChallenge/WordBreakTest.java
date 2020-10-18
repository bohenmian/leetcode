package com.leetcode.dailyChallenge;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordBreakTest {

    private final WordBreak wordBreak = new WordBreak();

    @Test
    public void should_return_whether_the_word_can_be_break_dfs() {
        List<String> wordDict = List.of("apple", "pen");
        boolean result = wordBreak.wordBreak("applepenapple", wordDict);
        assertTrue(result);
    }

    @Test
    public void should_return_whether_the_word_can_be_break_bfs() {
        List<String> wordDict = List.of("apple", "pen");
        boolean result = wordBreak.wordBreakOtherWay("applepenapple", wordDict);
        assertTrue(result);
    }

    @Test
    public void should_return_whether_the_word_can_be_break_dp() {
        List<String> wordDict = List.of("apple", "pen");
        boolean result = wordBreak.wordBreakThreeWay("applepenapple", wordDict);
        assertTrue(result);
    }
}
