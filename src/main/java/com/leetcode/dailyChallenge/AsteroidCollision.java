package com.leetcode.dailyChallenge;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int top;
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && (top = stack.peek()) > 0) {
                stack.pop();
                if (top == -asteroid) {
                    asteroid = 0;
                } else {
                    asteroid = top > -asteroid ? top : asteroid;
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        int size = stack.size();
        int[] result = new int[size];
        while (size > 0) {
            result[--size] = stack.pop();
        }
        return result;
    }

}
