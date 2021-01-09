package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumOfSubarraysTest {

    private final NumOfSubarrays subarrays = new NumOfSubarrays();

    @Test
    public void should_return_the_num_of_sub_array() {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int result = subarrays.numOfSubarrays(arr, 3, 4);
        assertEquals(3, result);
    }
}
