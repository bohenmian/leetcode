package com.leetcode.array;

public class ContainsPattern {

    public boolean containsPattern(int[] arr, int m, int k) {
        int last = arr.length - m * k;
        for (int i = 0; i <= last; i++) {
            boolean isMatch = true;
            for (int j = 1; j < k; j++) {
                for (int z = i + j * m; z < i + (j + 1) * m; z++) {
                    if (arr[z] != arr[z - m]) {
                        isMatch = false;
                        break;
                    }
                }
                if (!isMatch) {
                    break;
                }
            }
            if (isMatch) return true;
        }
        return false;
    }
}
