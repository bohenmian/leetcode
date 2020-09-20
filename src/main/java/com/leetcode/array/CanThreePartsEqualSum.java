package com.leetcode.array;

public class CanThreePartsEqualSum {

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int value : A) {
            sum += value;
        }
        int sumOfPartial = sum / 3;
        if (sumOfPartial * 3 != sum) {
            return false;
        }
        int left = 0;
        int leftSum = 0;
        int right = A.length - 1;
        int rightSum = 0;
        for (; left < A.length; left++) {
            leftSum += A[left];
            if (leftSum == sumOfPartial) break;
        }
        for (; right >= 0; right--) {
            rightSum += A[right];
            if (rightSum == sumOfPartial) break;
        }
        return left + 1 < right;
    }
}
