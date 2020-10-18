package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchTest {

    private final Search search = new Search();

    @Test
    public void should_return_the_search_index() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = this.search.search(nums, 9);
        assertEquals(4, result);
    }
}
