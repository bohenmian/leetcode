package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibTest {

    private final Fib fib = new Fib();

    @Test
    public void should_return_the_sum() {
        int result = fib.fib(6);
        assertEquals(8, result);
    }
}
