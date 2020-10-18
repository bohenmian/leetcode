package com.leetcode.array;

/**
 * https://leetcode-cn.com/problems/non-decreasing-array/solution/xiang-xia-guai-dian-de-xun-zhao-yu-xiao-chu-by-joh/
 */

public class CheckPossibility {

    public boolean checkPossibility(int[] nums) {
        int i = 0;
        int count = 0;
        while (i + 1 < nums.length) {
            if (nums[i + 1] < nums[i]) {
                count++;
                // 上移拐点后一个节点
                if (i - 1 >= 0 && nums[i - 1] > nums[i + 1]) nums[i + 1] = nums[i];
                // 下移拐点
                else nums[i] = nums[i + 1];
            }
            i++;
        }
        return count <= 1;
    }
}
