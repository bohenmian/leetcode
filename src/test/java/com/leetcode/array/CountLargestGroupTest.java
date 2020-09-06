package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountLargestGroupTest {

    private final CountLargestGroup group = new CountLargestGroup();

    @Test
    public void should_return_the_largest_group() {
        int result = group.countLargestGroup(13);
        assertEquals(4, result);
    }

    @Test
    public void should_return_the_largest_group_other_data() {
        int result = group.countLargestGroup(24);
        assertEquals(5, result);
    }
}
