package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FourSliceTest {

    private final FourSlice fourSlice = new FourSlice();

    @Test
    public void should_return_true_when_four_slice() {
        int[] numbers = new int[]{2, 3, 5, 1, 2, 2, 1, 1, 3};
        boolean result = fourSlice.resolve(numbers);
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_four_slice() {
        int[] numbers = new int[]{2, 3, 5, 1, 2, 2, 1, 1};
        boolean result = fourSlice.resolve(numbers);
        assertFalse(result);
    }
}
