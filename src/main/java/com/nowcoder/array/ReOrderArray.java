package com.nowcoder.array;

/**
 * question 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分
 */

public class ReOrderArray {

    public int[] reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            while (i < j && (array[i] & 1) != 0) {
                i++;
            }
            while (i < j && (array[j] & 1) == 0) {
                j--;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
