package com.leetcode.dailyChallenge;

/**
 * https://leetcode-cn.com/problems/repeated-substring-pattern/solution/zhong-fu-de-zi-zi-fu-chuan-by-leetcode-solution/
 */

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        // 从1开始枚举字符串s的字串，要满足s[i]=s[i-n], n为子串的长度
        for (int i = 1; i * 2 <= n; i++) {
            if (n % i == 0) {
                boolean isMatch = true;
                for (int j = i; j < n; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean repeatedSubstringPatternOtherWay(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    // TODO use KMP
}
