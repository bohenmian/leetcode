package com.leetcode.dailyChallenge;

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {
    private int sum;
    private final Queue<Integer> queue;
    private final int capacity;

    public MovingAverage(int size) {
        sum = 0;
        queue = new ArrayDeque<>();
        capacity = size;
    }

    public double next(int value) {
        if (queue.size() == capacity) {
            sum -= queue.poll();
        }
        sum += value;
        queue.offer(value);
        return 1.0 * sum / queue.size();
    }
}
