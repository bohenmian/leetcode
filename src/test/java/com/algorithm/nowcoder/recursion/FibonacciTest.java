package com.algorithm.nowcoder.recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibonacci() throws Exception {
        int n = 6;
        int result = fibonacci.Fibonacci(n);
        assertThat(result, is(13));
    }

}