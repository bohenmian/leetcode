package com.leetcode.array;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumIdenticalPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] result = new int[101];
        for (int num : nums) {
            result[num]++;
        }
        for (int j : result) {
            if (j > 1) {
                count += (j - 1) * j / 2;
            }
        }
        return count;
    }
}
