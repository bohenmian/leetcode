package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    private final MajorityElement element = new MajorityElement();

    @Test
    public void should_return_the_majority_element() {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> result = element.majorityElement(nums);
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, result);
    }
}
