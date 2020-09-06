package com.leetcode.array;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] array = new int[heights.length];
        System.arraycopy(heights, 0, array, 0, heights.length);
        Arrays.sort(array);
        for (int i = 0; i < heights.length; i++) {
            if (array[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }

    // sort O(NlogN)
    public int heightCheckerInOtherWay(int[] heights) {
        int[] arr = new int[101];
        int count = 0;
        for (int height : heights) {
            arr[height]++;
        }
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) {
                    count++;
                }
            }
        }
        return count;
    }

    // O(N)
    public int heightCheck(int[] heights) {
        int[] cnt = new int[101];
        for (int h : heights) {
            ++cnt[h];
        }
        for (int i = 1; i <= 100; ++i) {
            cnt[i] += cnt[i - 1];
        }
        int ans = 0;
        for (int i = heights.length - 1; i >= 0; --i) {
            if (heights[--cnt[heights[i]]] != heights[i])
                ++ans;
        }
        return ans;
    }
}
