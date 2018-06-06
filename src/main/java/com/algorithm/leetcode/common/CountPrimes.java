package com.algorithm.leetcode.common;

/**
 * 计算小于n的所有质数,
 */

public class CountPrimes {

    public int countPrimes(int n) {
        boolean isPrimes[] = new boolean[n + 1];
        int count = 0;
        if (n <= 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (isPrimes[i]) {
                //将小于根号n的所有质数且为质数的倍数剔除掉
                for (int j = i + i; j < n; j = j + i) {
                    isPrimes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                count++;
            }
        }
        return count;
    }
}
