package com.nowcoder.common;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution1Test {

    private Solution1 solution1 = new Solution1();

    @Test
    public void getLeastNumbers_Solution() {
        int[] array = new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> arrayList = solution1.GetLeastNumbers_Solution(array, 4);
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayList.get(i));
        }

    }
}