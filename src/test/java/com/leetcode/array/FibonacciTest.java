package com.leetcode.array;

import com.algorithm.nowcoder.recursion.Fibonacci;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibonacci() {
        int n = 6;
        int result = fibonacci.Fibonacci(n);
        assertThat(result, is(13));
    }

}
