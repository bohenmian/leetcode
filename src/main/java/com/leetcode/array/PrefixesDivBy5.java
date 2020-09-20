package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy5 {

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int value = 0;
        for (int j : A) {
            // 只需要记录最后一位即可
            value = ((value << 1) + j) % 5;
            if (value == 0) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
