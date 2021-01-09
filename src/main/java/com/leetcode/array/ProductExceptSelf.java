package com.leetcode.array;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int k = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= k;
            k *= nums[i];
        }
        return result;
    }
}
