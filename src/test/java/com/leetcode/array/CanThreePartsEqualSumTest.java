package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanThreePartsEqualSumTest {

    private final CanThreePartsEqualSum equalSum = new CanThreePartsEqualSum();

    @Test
    public void should_return_can_three_parts_equals_sum() {
        int[] a = {1, -1, 1, -1};
        boolean result = equalSum.canThreePartsEqualSum(a);
        assertFalse(result);
    }
}
