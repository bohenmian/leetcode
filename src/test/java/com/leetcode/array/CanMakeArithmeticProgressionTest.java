package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CanMakeArithmeticProgressionTest {

    private final CanMakeArithmeticProgression progression = new CanMakeArithmeticProgression();

    @Test
    public void should_return_true_when_can_make_arithmetic_progression() {
        boolean result = progression.canMakeArithmeticProgression(new int[]{3, 5, 1});
        assertTrue(result);
    }
}
