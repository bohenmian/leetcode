package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountServersTest {

    private final CountServers servers = new CountServers();

    @Test
    public void should_return_the_counted_server() {
        int[][] grid = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        int result = servers.countServers(grid);
        assertEquals(4, result);
    }
}
