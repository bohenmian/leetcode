package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityIITest {

    private final SortArrayByParityII parityII = new SortArrayByParityII();

    @Test
    public void should_return_the_sort_array() {
        int[] nums = {4, 2, 5, 7};
        int[] result = parityII.sortArrayByParityII(nums);
        assertArrayEquals(new int[]{4, 5, 2, 7}, result);
    }
}
