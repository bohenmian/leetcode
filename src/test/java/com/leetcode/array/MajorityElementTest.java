package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    private final MajorityElement element = new MajorityElement();

    @Test
    public void should_return_the_majority_element() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = element.majorityElement(nums);
        int expected = 2;
        assertEquals(expected, result);
    }
}
