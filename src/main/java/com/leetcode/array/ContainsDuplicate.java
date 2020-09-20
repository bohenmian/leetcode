package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsDuplicate {

    // O(N)
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int value : nums) {
            if (list.contains(value)) {
                return true;
            }
            list.add(value);
        }
        return false;
    }

    // to bad O(NlogN)
    public boolean containsDuplicateOtherWay(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
