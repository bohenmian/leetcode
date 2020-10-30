package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTripletsTest {

    private final CountTriplets triplets = new CountTriplets();

    @Test
    public void should_return_the_counted_triplets() {
        int[] arr = {1, 1, 1, 1, 1};
        int result = triplets.countTriplets(arr);
        assertEquals(10, result);
    }
}
