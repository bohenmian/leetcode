package com.leetcode.array;

import java.util.Arrays;

/**
 * 题目：一个整型数组，将其划分为和相同的4个切片，
 * 例如：{ 2, 3, 5, 1, 2, 2, 1, 1, 3 }，切片操作后划分为：{2,3}，{5}，{1,2,2}，{1,1,3}，也就找到所谓的四等分点。
 * 输出结果为true或者false（是否能得到这样的4个切片）。同时要求时间复杂度和空间复杂度为o(n)。
 */

public class FourSlice {
    public boolean resolve(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        int sliceSum = sum / 4;
        if (sliceSum * 4 != sum) {
            return false;
        }
        int tempSum = 0;
        int sliceCount = 0;
        int[] sliceIndex = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            tempSum += numbers[i];
            if (tempSum == sliceSum) {
                sliceIndex[sliceCount++] = i;
                tempSum = 0;
            }
        }
        return sliceIndex[3] == numbers.length - 1;
    }
}
