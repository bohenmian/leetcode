package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CanBeEqualTest {

    private final CanBeEqual equal = new CanBeEqual();

    @Test
    public void should_return_true_when_can_be_equal() {
        int[] target = new int[]{1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 3};
        boolean result = this.equal.canBeEqual(target, arr);
        assertTrue(result);
    }
}
