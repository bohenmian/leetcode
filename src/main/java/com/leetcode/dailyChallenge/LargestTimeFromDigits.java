package com.leetcode.dailyChallenge;

/**
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * <p>
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 * <p>
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 */

public class LargestTimeFromDigits {

    private int maxTime;

    public String largestTimeFromDigits(int[] A) {
        maxTime = -1;
        perm(A, 0);
        return toTime(maxTime);
    }

    private void perm(int[] nums, int start) {
        if (start == nums.length) {
            if (isValidTime(nums)) maxTime = Math.max(maxTime, getTimeVal(nums));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            perm(nums, start + 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    private boolean isValidTime(int[] nums) {
        int hours = nums[0] * 10 + nums[1];
        int min = nums[2] * 10 + nums[3];
        return 0 <= hours && hours < 24 && 0 <= min && min < 60;
    }

    private int getTimeVal(int[] nums) {
        int val = 0;
        for (int num : nums) {
            val *= 10;
            val += num;
        }
        return val;
    }

    private String toTime(int val) {
        if (val < 0) {
            return "";
        }

        int hour = val / 100;
        int mins = val % 100;
        StringBuilder res = new StringBuilder();
        if (hour < 10) {
            res.append(0);
        }
        res.append(hour);
        res.append(':');
        if (mins < 10) {
            res.append(0);
        }
        res.append(mins);
        return res.toString();
    }

}
