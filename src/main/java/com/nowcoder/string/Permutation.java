package com.nowcoder.string;

import java.util.ArrayList;

public class Permutation {
    public  static void Permutation(String string) {
        ArrayList<String> strings = new ArrayList<>();
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
