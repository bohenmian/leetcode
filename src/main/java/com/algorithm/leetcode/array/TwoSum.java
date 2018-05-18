package com.algorithm.leetcode.array;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            }
            if (numbers[low] + numbers[high] > target) {
                high--;
            }
            if (numbers[low] + numbers[high] < target) {
                low++;
            }
        }
        return numbers[low] + numbers[high] == target ? new int[]{low + 1, high + 1} : new int[]{-1, -1};
    }
}
