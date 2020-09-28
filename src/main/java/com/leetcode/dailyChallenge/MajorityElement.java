package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        int element1 = nums[0], count1 = 0;
        int element2 = nums[0], count2 = 0;

        // 投票阶段,找到两个候选
        for (int value : nums) {
            if (value == element1) {
                count1++;
                continue;
            }
            if (value == element2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                element1 = value;
                count1++;
                continue;
            }
            if (count2 == 0) {
                element2 = value;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }

        // 计数阶段
        count1 = count2 = 0;
        for (int value : nums) {
            if (value == element1) count1++;
            else if (value == element2) count2++;
        }
        if (count1 > nums.length / 3) result.add(element1);
        if (count2 > nums.length / 3) result.add(element2);
        return result;
    }
}
