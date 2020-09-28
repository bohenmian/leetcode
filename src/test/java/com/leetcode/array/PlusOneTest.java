package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    public void should_return_the_array_plus_one() {
        int[] result = plusOne.plusOne(new int[]{0});
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }
}
