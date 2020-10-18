package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContainsPatternTest {

    private final ContainsPattern pattern = new ContainsPattern();

    @Test
    public void should_return_contain_pattern() {
        int[] arr = {1, 2, 4, 4, 4, 4};
        boolean result = pattern.containsPattern(arr, 1, 3);
        assertTrue(result);
    }
}
