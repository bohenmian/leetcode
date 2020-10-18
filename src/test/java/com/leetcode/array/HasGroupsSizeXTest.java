package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HasGroupsSizeXTest {

    private final HasGroupsSizeX sizeX = new HasGroupsSizeX();

    @Test
    public void should_return_whether_has_group_size() {
        int[] deck = {1,1,2,2,2,2};
        boolean result = sizeX.hasGroupsSizeX(deck);
        assertTrue(result);
    }
}
