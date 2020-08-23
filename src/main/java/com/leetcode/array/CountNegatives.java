package com.leetcode.array;

public class CountNegatives {

    public int countNegatives(int[][] grid) {
        int count = 0, rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            int[] row = grid[i];
            if (row[cols - 1] >= 0) {
                continue;
            }
            // if the row 0 less than 0
            if (row[0] < 0) {
                count += (rows - i) * cols;
                break;
            }
            // binary search the first negative index
            int firstNegativePoint = binarySearch(row);
            count += cols - firstNegativePoint;
        }
        return count;
    }

    private static int binarySearch(int[] nums) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] >= 0) {
                start = mid + 1;
            } else {
                if (nums[mid - 1] >= 0) {
                    return mid;
                }
                end = mid;
            }
        }
        return start;
    }
}
