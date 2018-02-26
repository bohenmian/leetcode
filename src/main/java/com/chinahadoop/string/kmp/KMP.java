package com.chinahadoop.string.kmp;

/**
 * 给定文本串text和模式串pattern,从文本串text中找出模式串pattern第一次出现的位置
 * KMP算法滑动的距离为已经匹配的字符长度减去失配字符下标所对应的next数组
 */

public class KMP {

    public static int KMP_Search(String text, String pattern) {
        int ans = -1;
        int i = 0;
        int j = 0;
        int[] next = getNext(pattern);
        while (i < text.length() && j < pattern.length()) {
            if (j == -1 || text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
            if (j == pattern.length()) {
                ans = i - j;
                break;
            }
        }
        return ans;
    }

    private static int[] getNext(String pattern) {
        int size = pattern.length();
        int[] next = new int[size];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < size - 1) {
            if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
                ++k;
                ++j;
                if (pattern.charAt(j) == pattern.charAt(k)) {
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String text = "ABACABABC";
        String pattern = "ABAB";
        System.out.println(KMP_Search(text, pattern));
    }

}
