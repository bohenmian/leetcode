package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }
        pre.add(1);
        result.add(pre);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                curr.add(pre.get(j) + pre.get(j + 1));
            }
            curr.add(1);
            result.add(curr);
            pre = curr;
        }
        return result;
    }
}
