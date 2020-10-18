package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindPairsTest {

    private final FindPairs pairs = new FindPairs();

    @Test
    public void should_return_the_pair_count() {
        int[] nums = {1, 2, 4, 4, 3, 3, 0, 9, 2, 3};
        int result = this.pairs.findPairs(nums, 3);
        assertEquals(2, result);
    }
}
