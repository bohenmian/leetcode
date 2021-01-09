package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindMinFibonacciNumbers {

    public int findMinFibonacciNumbers(int k) {
        int a = 1, b = 1;
        List<Integer> fib = new ArrayList<>(List.of(1, 2));

        while (a + b <= k) {
            fib.add(a + b);
            int c = a + b;
            a = b;
            b = c;
        }

        int result = 0;
        for (int i = fib.size() - 1; i >= 0; i--) {
            if (k >= fib.get(i)) {
                result++;
                k -= fib.get(i);
            }
        }
        return result;
    }

    public int findMinFibonacciNumbersOtherWay(int k) {
        if (k < 2) return k;
        TreeSet<Integer> set = new TreeSet<>();
        for (int a = 0, b = 1; b < k; ) {
            int temp = b;
            b += a;
            a = temp;
            set.add(b);
        }

        int result = 0;
        while (k > 0) {
            int fib = set.floor(k);
            k -= fib;
            result++;
        }
        return result;
    }
}
