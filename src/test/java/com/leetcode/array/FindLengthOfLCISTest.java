package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLengthOfLCISTest {

    private final FindLengthOfLCIS lengthOfLCIS = new FindLengthOfLCIS();

    @Test
    public void should_return_the_length_of_LCIS() {
        int[] nums = {1, 3, 5, 4, 7};
        int result = this.lengthOfLCIS.findLengthOfLCIS(nums);
        assertEquals(3, result);
    }
}
