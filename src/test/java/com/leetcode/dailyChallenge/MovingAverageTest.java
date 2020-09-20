package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovingAverageTest {

    private final MovingAverage average = new MovingAverage(3);


    @Test
    public void should_return_the_moving_average() {
        average.next(1);
        average.next(10);
        average.next(3);
        double result = average.next(5);
        assertEquals(result, 6.00000, 5);
    }
}
