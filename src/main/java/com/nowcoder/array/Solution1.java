package com.nowcoder.array;

import java.util.ArrayList;

public class Solution1 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (sum < 3) {
            return arrayLists;
        }
        for (int n = (int) Math.sqrt(2 * sum); n >= 2 ; n--) {
            if ((n & 1) == 1 && sum % n == 0 || (sum % n) * 2 == n) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int j = 0, k = (sum / n) - (n - 1) / 2; j < n; j++, k++) {
                    arrayList.add(k);
                }
                arrayLists.add(arrayList);
            }
        }
        return arrayLists;
    }
}
