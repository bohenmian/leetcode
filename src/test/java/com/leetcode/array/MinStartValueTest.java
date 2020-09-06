package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinStartValueTest {

    private final MinStartValue value = new MinStartValue();

    @Test
    public void should_return_the_min_start_value() {
        int[] nums = {-3, 2, -3, 4, 2};
        int value = this.value.minStartValue(nums);
        assertEquals(5, value);
    }

    @Test
    public void should_return_the_min_value() {
        int[] nums = {1, 2};
        int value = this.value.minStartValue(nums);
        assertEquals(1, value);

    }
}
