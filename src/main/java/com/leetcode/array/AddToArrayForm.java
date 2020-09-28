package com.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int index = A.length - 1;
        while (index >= 0 || K > 0) {
            if (index >= 0) {
                K += A[index--];

            }
            result.add(K % 10);
            K /= 10;
        }
        Collections.reverse(result);
        return result;
    }

    public List<Integer> addToArrayFormOtherWay(int[] A, int K) {
        int[] arr = new int[Math.max(A.length, 20)];
        int idx = 0;
        while (K > 0) {
            arr[idx++] = K % 10;
            K /= 10;
        }
        int length = Math.max(idx, A.length);
        int carry = 0;
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int value = arr[i] + ((i > A.length - 1) ? 0 : A[A.length - 1 - i]) + carry;
            if (value >= 10) {
                carry = 1;
                value %= 10;
            } else {
                carry = 0;
            }
            result.addFirst(value);
        }
        if (carry == 1) {
            result.addFirst(carry);
        }
        return result;
    }
}
