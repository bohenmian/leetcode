package com.chinahadoop.string.kmp;

/**
 * 给定文本串text和模式串pattern,从文本串text中找出模式串pattern第一次出现的位置
 * 暴力求解
 */

public class BruteForceSearch {

    public static int BruteForceSearch(String text, String pattern) {
        int i = 0;
        int j = 0;
        while (i <= text.length() - pattern.length() && j < pattern.length()) {
            if (text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }
        if (j >= pattern.length()) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABDACDABCDF";
        String pattern = "ABC";
        System.out.println(BruteForceSearch(text, pattern));
    }
}
