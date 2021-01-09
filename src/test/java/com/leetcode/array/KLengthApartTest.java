package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KLengthApartTest {

    private final KLengthApart apart = new KLengthApart();

    @Test
    public void should_return_k_length_apart() {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        boolean result = apart.kLengthApart(nums, 2);
        assertTrue(result);
    }
}
