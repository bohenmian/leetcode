package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumPairsDivisibleBy60Test {

    private final NumPairsDivisibleBy60 numPairsDivisibleBy60 = new NumPairsDivisibleBy60();

    @Test
    public void should_return_the_num_pair_divisible() {
        int[] time = {30, 20, 150, 100, 40};
        int result = numPairsDivisibleBy60.numPairsDivisibleBy60(time);
        assertEquals(3, result);
    }
}
