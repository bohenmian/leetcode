package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProcessQueriesTest {

    private final ProcessQueries queries = new ProcessQueries();

    @Test
    public void should_return_the_process_queries() {
        int[] queries = {3, 1, 2, 1};
        int[] result = this.queries.processQueriesInOtherWay(queries, 5);
        int[] expected = {2, 1, 2, 1};
        assertArrayEquals(expected, result);
    }
}
