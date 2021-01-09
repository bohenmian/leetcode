package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumTimesAllBlueTest {

    private final NumTimesAllBlue allBlue = new NumTimesAllBlue();

    @Test
    public void should_return_the_num_times_all_blue_count() {
        int[] light = {2, 1, 3, 5, 4};
        int result = allBlue.numTimesAllBlue(light);
        assertEquals(3, result);
    }
}
