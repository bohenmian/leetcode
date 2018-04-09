package com.algorithm.chinahadoop.array;



/**
 * 题目：一个整型数组，将其划分为和相同的4个切片，
 * 例如：{ 2, 3, 5, 1, 2, 2, 1, 1, 3 }，切片操作后划分为：{2,3}，{5}，{1,2,2}，{1,1,3}，也就找到所谓的四等分点。
 * 输出结果为true或者false（是否能得到这样的4个切片）。同时要求时间复杂度和空间复杂度为o(n)。
 */

public class Question1 {

    public static boolean resolve(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        int sliceSum = sum / 4;
        if (sliceSum * 4 != sum) {
            return false;
        }
        int[] sliceIndex = new int[4];
        int sliceCount = 0;
        int temSum = 0;
        for (int i = 0; i < A.length; i++) {
            temSum += A[i];
            if (temSum == sliceSum) {
                sliceIndex[sliceCount++] = i;
                temSum = 0;
            }
        }
        if (sliceIndex[3] == A.length - 1) {
            return true;
        }
        return false;
    }

}
