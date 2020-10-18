package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class CheckIfExist {

    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (list.contains(arr[i] * 2) || (arr[i] % 2 == 0 && list.contains(arr[i] / 2))) return true;
            list.add(arr[i]);
        }
        return false;
    }
}
