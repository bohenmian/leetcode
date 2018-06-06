package com.algorithm.leetcode.array;

public class Rotate {

    public void rotate(int[] nums, int k) {
        //根据题意,如果k > nums.length那么是相当于将数字从右向左翻转
        if (nums == null || nums.length == 0 || k < 0) {
            return;
        }
        //避免k过大的情况
        int temp = k % nums.length;
        swap(nums, 0, nums.length - temp - 1);
        swap(nums, nums.length - temp, nums.length - 1);
        swap(nums, 0, nums.length - 1);
    }

    //swap number
    private void swap(int[] nums, int from, int to) {
        while (from < to) {
            int temp = nums[from];
            nums[from++] = nums[to];
            nums[to--] = temp;
        }
    }
}
