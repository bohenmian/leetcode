package com.algorithm.leetcode.string;

import java.util.Stack;

public class ParenthesisMatching {

    public static void Permutation(char[] s, int from, int to) {
        if (to < 1)
            return;
        if (from == to) {
            if (isLegal(s)) {
                System.out.println(s);
            }
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
        String s = "(())";
        Permutation(s.toCharArray(), 0, s.length() - 1);
        //TODO去重

    }

    private static boolean isLegal(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (stack.isEmpty() && s[i] == ')') {
                return false;
            }
            if (s[i] == '(') {
                stack.push(s[i]);
            }
            if (s[i] == ')' && stack.peek() == '(') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private static boolean isDulicate(char[] s, int n, int t) {
        while (n < t) {
            if (s[n] == s[t]) {
                return false;
            }
            n++;
        }
        return true;
    }
}
