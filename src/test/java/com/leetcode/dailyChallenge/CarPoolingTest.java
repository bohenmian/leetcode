package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarPoolingTest {

    private final CarPooling carPooling = new CarPooling();

    @Test
    public void should_return_whether_the_car_can_pooling_the_passengers() {
        int[][] trips = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        boolean result = carPooling.carPooling(trips, 11);
        assertTrue(result);
    }
}
