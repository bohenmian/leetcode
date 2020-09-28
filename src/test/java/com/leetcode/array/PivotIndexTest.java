package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PivotIndexTest {

    private final PivotIndex index = new PivotIndex();

    @Test
    public void should_return_the_index_of_pivot() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = index.pivotIndex(nums);
        assertEquals(3, result);
    }
}
