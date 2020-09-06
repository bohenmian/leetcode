package com.leetcode.dailyChallenge;

import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer maxValue = set.ceiling(nums[i]);
            if (maxValue != null && maxValue <= nums[i] + t) return true;
            Integer minValue = set.floor(nums[i]);
            if (minValue != null && nums[i] <= minValue + t) return true;
            set.add(nums[i]);
            // slide window
            if (set.size() > k) set.remove(nums[i - k]);
        }
        return false;
    }
}
