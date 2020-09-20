package com.leetcode.array;

public class MaxProducts {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int num : nums) {
            if (num < 0) {
                // 如果num小于0,那么乘以这个数imin为正,imax为负
                // 所以最大值为imin * num[i], 最小值为imax * num[i]
                // 因为这里交换位置
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);

            max = Math.max(max, imax);
        }
        return max;
    }
}
