package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShipWithinDaysTest {

    private final ShipWithinDays days = new ShipWithinDays();

    @Test
    public void should_return_the_ship_within_days() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = days.shipWithinDays(weights, 5);
        assertEquals(15, result);
    }
}
