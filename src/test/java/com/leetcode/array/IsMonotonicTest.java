package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsMonotonicTest {

    private final IsMonotonic monotonic = new IsMonotonic();

    @Test
    public void should_return_true() {
        int[] A = new int[]{1, 2, 2, 3};
        boolean monotonic = this.monotonic.isMonotonic(A);
        assertTrue(monotonic);
    }
}
