package com.leetcode.array;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] array = Arrays.copyOf(heights, heights.length);
        Arrays.sort(array);
        for (int i = 0; i < heights.length; i++) {
            if (array[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
