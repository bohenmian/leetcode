package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequentialDigitsTest {

    private final SequentialDigits digits = new SequentialDigits();

    @Test
    public void should_return_the_sequential_digits() {
        List<Integer> result = digits.sequentialDigits(1000, 13000);
        List<Integer> expected = Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345);
        assertEquals(expected, result);
    }
}
