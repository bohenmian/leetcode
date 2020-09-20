package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumSmallerByFrequencyTest {

    private final NumSmallerByFrequency smaller = new NumSmallerByFrequency();

    @Test
    public void should_return_the_num_smaller_by_frequency() {
        int[] result = smaller.numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"});
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_the_num_smaller_by_frequency_other_data() {
        int[] result = smaller.numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"});
        int[] expected = {1, 2};
        assertArrayEquals(expected, result);
    }
}
