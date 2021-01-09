package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinFibonacciNumbersTest {

    private final FindMinFibonacciNumbers find = new FindMinFibonacciNumbers();

    @Test
    public void should_return_the_number_count_the_sum_equals_k() {
        int result = find.findMinFibonacciNumbers(10);
        assertEquals(2, result);
    }
}
