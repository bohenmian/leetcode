package com.leetcode.array;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).filter(num -> String.valueOf(num).length() % 2 == 0).count();
    }

    public int findNumbersInOtherWay(int[] nums) {
        int result = 0;
        for (int num : nums)
            if ((num >= 10 && num < 100) || (num >= 1000 && num < 10000) || num == 100000) {
                result++;
            }
        return result;
    }
}
