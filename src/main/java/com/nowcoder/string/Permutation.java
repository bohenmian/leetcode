package com.nowcoder.string;


/**
 * * 题目描述：输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，
 *           则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab,cba.
 */

public class Permutation {
    public  static void Permutation(String string) {
        if (string == null) {
            return;
        }
        PermutationCore(string.toCharArray(), 0, string.toCharArray().length - 1);

    }

    public static void PermutationCore(char[] chars, int from, int to) {
        if (from == chars.length) {
            System.out.println(chars);
        } else {
            for (int i = from; i <= chars.length - 1; i++) {
                swap(chars, i, from);
                PermutationCore(chars, from + 1, to);
                swap(chars, from, i);
            }
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
