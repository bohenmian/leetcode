package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLuckyTest {

    private final FindLucky lucky = new FindLucky();

    @Test
    public void should_return_the_lucky_number() {
        int result = lucky.findLucky(new int[]{5});
        assertEquals(-1, result);
    }

    @Test
    public void should_return_find_lucky_number() {
        int result = lucky.findLucky(new int[]{1, 2, 2, 3, 3, 3});
        assertEquals(3, result);
    }
}
