package com.leetcode.array;

public class DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0;
        int sum = 0;
        for (int j : distance) {
            sum += j;
        }
        if (start < destination) {
            for (int i = start; i < destination; i++) {
                clockwise += distance[i];
            }
        } else {
            for (int i = start; i < distance.length; i++) {
                clockwise += distance[i];
            }
            for (int i = 0; i < destination; i++) {
                clockwise += distance[i];
            }
        }

        return Math.min(clockwise, sum - clockwise);
    }

}
