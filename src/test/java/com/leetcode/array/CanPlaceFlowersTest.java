package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CanPlaceFlowersTest {

    private final CanPlaceFlowers flowers = new CanPlaceFlowers();

    @Test
    public void should_return_whether_can_place_flowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        boolean result = flowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(result);
    }
}
