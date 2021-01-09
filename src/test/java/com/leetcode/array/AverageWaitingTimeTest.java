package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageWaitingTimeTest {

    private final AverageWaitingTime waitingTime = new AverageWaitingTime();

    @Test
    public void should_return_the_average_waiting_time() {
        int[][] customers = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        double result = waitingTime.averageWaitingTime(customers);
        assertEquals(3.25, result, 2);
    }
}
