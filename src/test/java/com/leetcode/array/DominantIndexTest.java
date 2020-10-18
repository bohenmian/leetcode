package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominantIndexTest {

    private final DominantIndex index = new DominantIndex();

    @Test
    public void should_return_the_dominant_index() {
        int[] nums = {3, 6, 1, 0};
        int result = index.dominantIndex(nums);
        assertEquals(1, result);
    }
}
