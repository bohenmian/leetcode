package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumSpecialTest {

    private final NumSpecial special = new NumSpecial();

    @Test
    public void should_return_special_number_count() {
        int[][] mat = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int result = special.numSpecial(mat);
        assertEquals(3, result);
    }
}
