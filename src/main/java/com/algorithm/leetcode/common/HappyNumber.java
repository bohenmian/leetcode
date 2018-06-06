package com.algorithm.leetcode.common;

import java.util.HashSet;

/**
 * Happy Number代表如果一个数n在组成新数的过程中再次出现,那么它一定不是happy number
 */

public class HappyNumber {

    public boolean isHappy(int n) {
        int newN = 0;
        HashSet<Integer> set = new HashSet<>();
        //判断HashSet中是否包含这个数
        while (!set.contains(n)) {
            set.add(n);
            //注意此处要将newN重置,否则会不断叠加
            newN = 0;
            while (n != 0) {
                newN += (n % 10) * (n % 10);
                n /= 10;
            }
            n = newN;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
