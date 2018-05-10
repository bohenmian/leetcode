package com.algorithm.leetcode.string;

public class Manacher {
    public static void longestPalindrome(String s) {
        if (s.length() == 1) {
            return;
        }
        StringBuilder builder = new StringBuilder("$#");
        String result = new String();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i)).append("#");
        }
        int size = builder.length();
        if (size <= 0) {
            return;
        }
        int[] P = new int[size];
        P[0] = 1;
        int id = 0, mx = 1, max = 0, k = 0;
        for (int i = 1; i < builder.length(); i++) {
            if (mx > i) {
                P[i] = Math.min(mx - i, P[2 * id - i]);
            } else {
                P[i] = 1;
            }
            while (i + P[i] < size && i - P[i] >= 0 && builder.charAt(i + P[i]) == builder.charAt(i - P[i])) {
                P[i]++;
            }
            if (mx < i + P[i]) {
                mx = i + P[i];
                id = i;
            }
            if (max < P[i]) {
                max = P[i];//记录长度
            }
        }
        System.out.println(max - 1);
    }

    public static void main(String[] args) {
        String s = "ababd";
        longestPalindrome(s);
    }
}
