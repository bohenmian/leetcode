package com.nowcoder.array;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

import java.util.ArrayList;

public class GetUglyNumber_Solution {

    public static int GetUglyNumber_Solution(int index) {
        if (index < 0) {
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int i = 0, j = 0, k = 0;
        while (arrayList.size() < index) {
            int m1 = arrayList.get(i) * 2;
            int m2 = arrayList.get(j) * 3;
            int m3 = arrayList.get(k) * 5;
            int min = Math.min(m1, Math.min(m2, m3));
            arrayList.add(min);
            if (min == m1) {
                i++;
            }
            if (min == m2) {//避免min值等于m1,m2,m3中的两个,此处只能用if不能用if else
                j++;
            }
            if (min == m3) {
                k++;
            }
        }
        return arrayList.get(arrayList.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }
}
