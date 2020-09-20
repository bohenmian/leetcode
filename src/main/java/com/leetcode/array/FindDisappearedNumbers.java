package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= length; i++) {
            if (!set.contains(i)) result.add(i);
        }
        return result;
    }

    public List<Integer> findDisappearedNumbersOtherWay(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            // 将原来的值变为负数，并且保存原来该未知的值，下次使用
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
