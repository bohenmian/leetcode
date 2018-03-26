package com.nowcoder.common;

/**
 * 约瑟夫环问题
 */

import java.util.LinkedList;

public class Solution4 {

    public static int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int old = 0;

        while (list.size() > 1) {
            old = (old + m - 1) % list.size();
            list.remove(old);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }
}
