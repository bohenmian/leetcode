package com.leetcode.array;

public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {
        int possibleDuplicateZeros = 0;
        int length = arr.length - 1;
        for (int left = 0; left <= length - possibleDuplicateZeros; left++) {
            if (arr[left] == 0) {
                if (left == length - possibleDuplicateZeros) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDuplicateZeros++;
            }
        }
        int last = length - possibleDuplicateZeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDuplicateZeros] = 0;
                possibleDuplicateZeros--;
                arr[i + possibleDuplicateZeros] = 0;
            } else {
                arr[i + possibleDuplicateZeros] = arr[i];
            }
        }
        return arr;
    }
}
