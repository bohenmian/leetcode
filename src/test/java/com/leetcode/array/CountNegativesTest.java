package com.leetcode.array;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CountNegativesTest {

    private CountNegatives countNegatives = new CountNegatives();

    @Test
    public void should_return_the_count_of_the_negative() {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int count = countNegatives.countNegatives(grid);
        assertEquals(8, count);
    }
}
