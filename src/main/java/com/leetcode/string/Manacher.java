package com.leetcode.string;

/**
 * 给定字符串str,若子串s是回文串,称s为str的回文子串,求回文子串的最大长度
 * 12212321的回文子串为12321,长度为5
 */

public class Manacher {

    static void Manacher(StringBuilder str) {
        int size = str.length();
        int[] P = new int[size];
        P[0] = 1;
        int id = 0;
        int mx = 1;
        int max = 0;//记录子串的长度
        for (int i = 1; i < size; i++) {
            if (mx > i) {
                P[i] = Math.min(P[2 * id - i], mx - i);
            } else {
                P[i] = 1;
            }
            while (i + P[i] < size && i - P[i] >= 0 && str.charAt(i + P[i]) == str.charAt(i - P[i])) {
                P[i]++;
            }
            if (mx < i + P[i]) {
                mx = i + P[i];
                id = i;
            }
            if (max < P[i]) {
                max = P[i];
            }
        }
        System.out.println(max - 1);
    }

    public static void main(String[] args) {
        String str = "12212321";
        StringBuilder builder = new StringBuilder("$#");
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i)).append("#");
        }
        Manacher(builder);
    }
}
