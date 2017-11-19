package com.chinahadoop.string;

/**
 * 给定一个字符串S[0...N-1],要求把S的前k个字符移动到S的尾部，如把字符串"abcdef"前面的2个字符移动到字符串的尾部,得到新字符串"cdefab"
 * 要求时间复杂度O(n),空间复杂度O(1)
 */

public class LeftRotateString {

    public String ReverseString(String s, int n, int m) {
        if (s == null || s.length() == 0) {
            return null;
        } else {
            return LeftRotateString(s.toCharArray(), n, m);
        }
    }

    public String LeftRotateString(char[] s, int n, int m) {
        if (s == null || s.length == 0) {
            return null;
        } else {
            m %= n;
            Reverse(s, 0, m - 1);
            Reverse(s, m, n - 1);
            Reverse(s, 0, n - 1);
            return String.valueOf(s);
        }

    }

    void Reverse(char[] s, int from, int to) {
        while (from < to) {
            char temp = s[from];
            s[from++] = s[to];
            s[to--] = temp;
        }
    }
}
