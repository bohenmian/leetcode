package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestDistancePairTest {

    private final SmallestDistancePair pair = new SmallestDistancePair();

    @Test
    public void should_return_the_smallest_distance_pair() {
        int[] nums = {1, 3, 1};
        int result = pair.smallestDistancePair(nums, 1);
        assertEquals(result,0);
    }
}
