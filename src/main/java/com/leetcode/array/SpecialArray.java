package com.leetcode.array;

import java.util.Arrays;

public class SpecialArray {

    public int specialArray(int[] nums) {
        int[] count = new int[1001];
        for (int num : nums) count[num]++;
        int value = nums.length;
        for (int i = 0; i < count.length; i++) {
            if (value < i) return -1;
            else if (value == i) return i;
            value -= count[i];
        }
        return -1;
    }

    // BF
    public int specialArrayInOtherWay(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < nums[0]) return -1;
        int idx = nums.length - 1;
        int i = 1;
        while (idx > 0) {
            if (idx <= nums[i] && idx > nums[i-1]) return idx;
            else {
                i++;
                idx--;
            }
        }
        return -1;
    }
}
