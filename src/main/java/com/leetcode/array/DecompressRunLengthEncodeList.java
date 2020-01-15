package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodeList {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = nums[i]; j >= 0; j--) {
                list.add(nums[i + 1]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] decompressRLElistOtherWay(int[] nums) {
        int sum = 0, k = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        int[] result = new int[sum];
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[k++] = nums[i + 1];
            }
        }
        return result;
    }
}
