package com.algorithm.leetcode.dp;

public class HouseRobber {

    public int rob(int[] nums) {
        //判断nums数组是否为空
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //如果nums数组中只有一个元素,那么直接返回
        if (nums.length == 1) {
            return nums[0];
        }
        //如果nums中有两个元素,返回他们两个中的大值
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        //dp的起始条件,计算nums[2]
        nums[2] += nums[0];
        int i = 3;
        for (; i < nums.length; i++) {
            //当前的最大值为不相邻的最大值加上现在的最大值
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }
        //最后两个元素相比较
        return Math.max(nums[i - 1], nums[i - 2]);
    }
}
