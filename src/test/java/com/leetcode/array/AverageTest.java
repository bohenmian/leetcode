package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageTest {
    private final Average average = new Average();

    @Test
    public void should_return_the_average_salary() {
        int[] salary = new int[]{4000, 3000, 1000, 2000};
        double result = average.average(salary);
        assertEquals(2500, result, 5);
    }
}
