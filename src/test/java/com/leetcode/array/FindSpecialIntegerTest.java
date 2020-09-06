package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSpecialIntegerTest {

    private final FindSpecialInteger integer = new FindSpecialInteger();

    @Test
    public void should_return_the_special_integer() {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int result = integer.findSpecialInteger(arr);
        int expected = 6;
        assertEquals(expected, result);
    }
}
