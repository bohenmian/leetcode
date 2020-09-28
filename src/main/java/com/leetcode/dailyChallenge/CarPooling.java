package com.leetcode.dailyChallenge;

public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] allTrip = new int[1001];
        for (int[] trip : trips) {
            for (int j = trip[1]; j < trip[2]; j++) {
                allTrip[j] += trip[0];
                if (allTrip[j] > capacity) return false;
            }
        }
        return true;
    }

    public boolean carPoolingOtherWay(int[][] trips, int capacity) {
        int[] capacityChanges = new int[1001];
        for (int[] trip : trips) {
            capacityChanges[trip[1]] -= trip[0];
            capacityChanges[trip[2]] += trip[0];
        }
        for (int capacityChange : capacityChanges) {
            capacity += capacityChange;
            if (capacity < 0) return false;
        }
        return true;
    }
}
