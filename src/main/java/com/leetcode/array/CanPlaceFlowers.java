package com.leetcode.array;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int idx = 0, count = 0;
        while (idx < flowerbed.length) {
            if (flowerbed[idx] == 0 && (idx == 0 || flowerbed[idx - 1] == 0) && (idx == flowerbed.length - 1 || flowerbed[idx + 1] == 0)) {
                flowerbed[idx] = 1;
                count++;
            }
            idx++;
        }
        return count >= n;
    }
}
