package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {

    private final HeightChecker checker = new HeightChecker();

    @Test
    public void should_return_the_minimum_number() {
        int[] height = new int[]{1, 1, 4, 2, 1, 3};
        int result = checker.heightChecker(height);
        assertEquals(3, result);
    }

    @Test
    public void should_return_the_minimum_number_in_other_way() {
        int[] heights = new int[]{5, 1, 2, 3, 4};
        int result = checker.heightCheckerInOtherWay(heights);
        assertEquals(5, result);
    }
}
