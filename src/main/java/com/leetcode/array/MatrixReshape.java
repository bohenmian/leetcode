package com.leetcode.array;


public class MatrixReshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) return nums;
        int rows = 0;
        int cols = 0;
        int[][] result = new int[r][c];
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                result[rows][cols] = num[j];
                if (cols == c - 1) {
                    rows++;
                    cols = 0;
                } else {
                    cols++;
                }
            }
        }
        return result;
    }

    // this way it more than 100% submission
    public int[][] matrixReshapeOtherWay(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) return nums;
        int[][] result = new int[r][c];
        int count = 0;
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                result[count / c][count % c] = num[j];
                count++;
            }
        }
        return result;
    }
}
