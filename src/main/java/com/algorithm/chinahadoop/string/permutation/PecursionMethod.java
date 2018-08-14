package com.algorithm.chinahadoop.string.permutation;

/**
 * 对一个字符串进行全排列
 * 递归方法
 */

public class PecursionMethod {

    public static void Permutation(char[] s, int from, int to) {
        if (to <= 1)
            return;
        if (from == to) {
            System.out.println(s);
        }
        for (int i = from; i <= to; i++) {
            swap(s, i, from);
            Permutation(s, from + 1, to);
            swap(s, from, i);
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        String s = "aazz";
        Permutation(s.toCharArray(), 0, s.length() - 1);
    }
}
