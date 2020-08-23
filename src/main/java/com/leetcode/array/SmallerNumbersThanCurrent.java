package com.leetcode.array;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        for (int num : nums) {
            buck[num] += 1;
        }
        for (int i = 1; i < 101; i++) {
            buck[i] += buck[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int pos = nums[i];
            nums[i] = pos == 0 ? 0 : buck[pos - 1];
        }
        return nums;
    }
}
