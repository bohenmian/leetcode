package com.leetcode.array;

public class CountLargestGroup {

    public int countLargestGroup(int n) {
        if (n < 9) {
            return n;
        }
        int[] count = new int[37];
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }
        int maxCount = 1;
        int result = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = 0;
            }
            if (count[i] == maxCount) {
                result++;
            }
        }
        return result;
    }
}
