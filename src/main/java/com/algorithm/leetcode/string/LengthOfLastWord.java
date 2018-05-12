package com.algorithm.leetcode.string;

/**
 * 求最后一个单词的长度
 * 1.影响从尾向头遍历
 * 2.注意字符串最后一个字符为空格
 * 3.注意整个字符串没有空格的情况
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count != 0) {
                return count;
            }
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
