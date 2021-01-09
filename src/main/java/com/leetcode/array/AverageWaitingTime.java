package com.leetcode.array;

public class AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        double sum = 0;
        int b = 0;
        for (int[] customer : customers) {
            if (b > customer[0]) sum += b - customer[0];
            if (b < customer[0]) b = customer[0];
            b += customer[1];
            sum += customer[1];
        }
        return sum / customers.length;
    }
}
