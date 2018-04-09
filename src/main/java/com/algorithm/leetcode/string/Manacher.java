package com.algorithm.leetcode.string;

public class Manacher {

    public static String longestPalindrome(String s) {
        StringBuilder builder = new StringBuilder("$#");
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i)).append("#");
        }

        StringBuilder result = new StringBuilder();
        int size = builder.length();
        if (size <= 0) {
            return null;
        }
        int[] P = new int[size];
        P[0] = 1;
        int id = 0, mx = 1, max = 0;
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
                max = P[i];
            }
        }
        for (int j = id - max + 1; j < id + max - 1; j++) {
            if (builder.charAt(j) == '#') {
                continue;
            }
            result.append(builder.charAt(j));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

}
