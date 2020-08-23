package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SmallerNumbersThanCurrentTest {

    private SmallerNumbersThanCurrent current = new SmallerNumbersThanCurrent();

    @Test
    public void should_return_smaller_numbers_than_current() {
        int[] result = current.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, result);
    }
}
