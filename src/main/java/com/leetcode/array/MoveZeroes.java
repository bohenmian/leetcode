package com.leetcode.array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // move the Non-Zero element to the array start position
                nums[slow++] = nums[i];
                if (slow != i + 1) {
                    nums[i] = 0;
                }
            }
        }
    }
}
