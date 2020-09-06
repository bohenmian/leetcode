package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThreeConsecutiveOddsTest {

    private final ThreeConsecutiveOdds odds = new ThreeConsecutiveOdds();

    @Test
    public void should_return_true_when_exist() {
        int[] nums = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean threeConsecutiveOdds = odds.threeConsecutiveOdds(nums);
        assertTrue(threeConsecutiveOdds);
    }

    @Test
    public void should_return_false_when_not_exist() {
        int[] nums = new int[]{2,6,4,1};
        boolean threeConsecutiveOdds = odds.threeConsecutiveOdds(nums);
        assertFalse(threeConsecutiveOdds);
    }
}
