package com.algorithm.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        if (rowIndex < 0) {
            return pre;
        }
        pre.add(1);     //第0层的数组
        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1));   //计算本层首元素和最后一个元素的中间元素
            }
            cur.add(1);
            pre = cur;      //保留上一层的元素
        }
        return pre;
    }
}
