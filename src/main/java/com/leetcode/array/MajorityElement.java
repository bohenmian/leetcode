package com.leetcode.array;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for (int value : nums) {
            if (count == 0) {
                result = value;
            }
            count += (value == result) ? 1 : -1;
        }
        return result;
    }
}
