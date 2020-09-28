package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertTest {

    private final SearchInsert insert = new SearchInsert();

    @Test
    public void should_return_the_insert_position() {
        int[] nums = {1, 3, 5, 6};
        int result = insert.searchInsert(nums, 0);
        assertEquals(0, result);
    }
}
