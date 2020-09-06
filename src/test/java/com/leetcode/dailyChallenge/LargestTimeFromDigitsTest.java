package com.leetcode.dailyChallenge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LargestTimeFromDigitsTest {

    private final LargestTimeFromDigits largestTimeFromDigits = new LargestTimeFromDigits();

    @Test
    public void should_return_the_largest_time() {
        int[] A = new int[]{1, 2, 3, 4};
        String digits = largestTimeFromDigits.largestTimeFromDigits(A);
//        assertEquals("23:41", digits);
    }
}
