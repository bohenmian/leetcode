package com.leetcode.array;

public class ShipWithinDays {

    public int shipWithinDays(int[] weights, int D) {
        int min = 501;
        int max = 0;
        for (int weight : weights) {
            min = Math.min(min, weight);
            max += weight;
        }

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (canShip(weights, D, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private boolean canShip(int[] weights, int D, int K) {
        int cur = K;
        for (int weight : weights) {
            if (weight > K) return false;
            if (cur < weight) {
                cur = K;
                D--;
            }
            cur -= weight;
        }
        return D > 0;
    }


}
