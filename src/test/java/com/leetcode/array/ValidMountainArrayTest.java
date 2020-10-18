package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ValidMountainArrayTest {

    private final ValidMountainArray array = new ValidMountainArray();

    @Test
    public void should_valid_mountain() {
        int[] a = {9, 8, 7, 6, 5};
        boolean result = array.validMountainArray(a);
        assertFalse(result);
    }
}
