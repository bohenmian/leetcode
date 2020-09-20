package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceBetweenBusStopsTest {

    private final DistanceBetweenBusStops stops = new DistanceBetweenBusStops();

    @Test
    public void should_return_the_distance_between_bus_stop() {
        int[] distance = {7, 10, 1, 12, 11, 14, 5, 0};
        int start = 7;
        int destination = 2;
        int result = stops.distanceBetweenBusStops(distance, start, destination);
        assertEquals(result, 17);
    }
}
