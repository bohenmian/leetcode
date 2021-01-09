package com.leetcode.array;

public class KthSmallest {

    public int kthSmallest(int[][] matrix, int k) {
        int length = matrix.length;
        int left = matrix[0][0];
        int right = matrix[length - 1][length - 1];
        while (left < right) {
            int mid = left + ((right - left) >> 1);
                if (check(matrix, mid, k, length)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        int count = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                count += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return count >= k;
    }
}
