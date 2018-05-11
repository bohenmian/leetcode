package com.algorithm.leetcode.stack;

/**
 * 括号的匹配问题:　栈的典型应用
 */

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char top = stack.pop();
                if (s.charAt(i) == ')') {
                    if (top != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (top != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (top != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}
