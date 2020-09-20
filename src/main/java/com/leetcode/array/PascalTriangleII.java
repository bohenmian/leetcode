package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                current.add(pre.get(j) + pre.get(j + 1));
            }
            current.add(1);
            pre = current;
        }
        return pre;
    }
}
