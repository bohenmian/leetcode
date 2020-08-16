package com.leetcode.string.permutation;

/**
 * 字符串的全排列
 * 非递归
 */

public class CommonMethod {

    public static boolean Permutation(char[] chars, int size) {
        int i = size - 2;
        //后找
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = size - 1;
        //小大
        while (chars[j] <= chars[i]) {
            j--;
        }
        //交换
        swap(chars, i, j);
        //翻转
        Reverse(chars, i + 1, size - 1);
        return true;
    }

    static void swap(char[] s, int m, int n) {
        char temp = s[m];
        s[m] = s[n];
        s[n] = temp;
    }

    static void Reverse(char[] s, int from, int to) {
        while (from < to) {
            char temp = s[from];
            s[from++] = s[to];
            s[to--] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "aazz";
        char[] chars = s.toCharArray();
        System.out.println(chars);
        while (Permutation(chars, chars.length)) {
            System.out.println(String.valueOf(chars));
        }
    }


}
