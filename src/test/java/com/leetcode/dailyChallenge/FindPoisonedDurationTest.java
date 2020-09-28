package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindPoisonedDurationTest {

    private final FindPoisonedDuration duration = new FindPoisonedDuration();

    @Test
    public void should_return_poisoned_duration() {
        int[] timeSeries = {1, 4};
        int result = duration.findPoisonedDuration(timeSeries, 2);
        assertEquals(4, result);
    }
}
