package com.algorithm.leetcode.common;

/**
 * 杨辉三角 Java
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows <= 0) {
            return lists;
        }
        //第一行的杨辉三角只有一个数(1)
        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);
        lists.add(pre);     //将第一行加入lists
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            cur.add(1);    //杨辉三角每一行都是以1开始
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);    //杨辉三角的每一行结尾也是1
            lists.add(cur);     //将这一行数据加入list
            pre = cur;      //记录上一行的数据
        }
        return lists;
    }
}
