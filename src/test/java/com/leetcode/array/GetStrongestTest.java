package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GetStrongestTest {

    private final GetStrongest strongest = new GetStrongest();

    @Test
    public void should_return_the_strongest_array() {
        int[] array = {6, -3, 7, 2, 11};
        int[] result = this.strongest.getStrongest(array, 3);
        int[] expected = {-3, 11, 2};
        assertArrayEquals(expected, result);
    }
}
