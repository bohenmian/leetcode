package com.algorithm.leetcode.array;

public class MergeSortArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lengthNumbers1 = m - 1;     //length of nums1
        int lengthNumbers2 = n - 1;     //length of nums2
        int index = m + n - 1;          //length of nums1 and nums2
        while (lengthNumbers1 >= 0 && lengthNumbers2 >= 0) {
            if (nums1[lengthNumbers1] >= nums2[lengthNumbers2]) {   //因为数组都是排序过的,所以直接比较对应位置上的数字大小
                nums1[index--] = nums1[lengthNumbers1--];
            } else {
                nums1[index--] = nums2[lengthNumbers2--];
            }
        }       //循环终止的条件为某一个数组的元素已经比较完
        while (lengthNumbers2 >= 0) {
            nums1[index--] = nums2[lengthNumbers2--];
        }
    }
}
