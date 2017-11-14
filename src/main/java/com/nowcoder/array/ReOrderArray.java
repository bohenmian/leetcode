package com.nowcoder.array;

public class ReOrderArray {

    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
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
    }
}
