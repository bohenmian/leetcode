package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinSetSizeTest {

    private final MinSetSize size = new MinSetSize();

    @Test
    public void should_return_the_min_set_size() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = size.minSetSize(arr);
        assertEquals(5, result);
    }
}
