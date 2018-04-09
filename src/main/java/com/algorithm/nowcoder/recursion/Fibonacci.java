package com.algorithm.nowcoder.recursion;

/**
 * question
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 */

public class Fibonacci {

    public int Fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
