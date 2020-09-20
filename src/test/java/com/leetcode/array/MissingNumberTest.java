package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void should_return_the_missing_number() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber.missingNumber(nums);
        assertEquals(8, result);
    }

    @Test
    public void should_return_the_missing_number_other_data() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber.missingNumberInOtherWay(nums);
        assertEquals(8, result);
    }
}
