package com.chinahadoop.string;

/**
 * 给定一个长度为n的字符串S,如果存在一个字符串T,重复若干次T能够得到S,那么,S叫做周期串,T叫做S的一个周期。
 * 如:字符串abababab是周期串,abab、ab都是它的周期,其中,ab是它的最小周期。
 * 设计一个算法,计算S的最小周期。如果S不存在周期,返回空串
 */

public class PowerString {

    public static int MinPeriod(String s) {
        int length = s.length();
        if (length == 0) {
            return -1;
        }
        int[] next = new int[length];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < length - 1) {
            if (k == -1 || s.charAt(j + 1) == s.charAt(k)) {
                ++k;
                ++j;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        next[0] = 0;
        int last = next[length - 1];
        if (last == 0) {
            return -1;
        }
        if (length % (length - last) == 0) {
            return length - last;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "ABCABCABC";
        int minPeriod = MinPeriod(s);
        System.out.println(minPeriod);
    }
}
