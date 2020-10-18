package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialArrayTest {

    private final SpecialArray array = new SpecialArray();

    @Test
    public void should_return_the_special_array() {
        int[] nums = {3, 5};
        int result = array.specialArray(nums);
        assertEquals(2, result);
    }
}
