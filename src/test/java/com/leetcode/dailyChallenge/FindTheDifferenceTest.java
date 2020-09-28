package com.leetcode.dailyChallenge;

import com.leetcode.array.FindTheDifference;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDifferenceTest {

    private final FindTheDifference difference = new FindTheDifference();

    @Test
    public void should_return_the_diff_number() {
        char result = difference.findTheDifference("abcd", "abcde");
        assertEquals('e', result);
    }
}
