package com.algorithm.nowcoder.string;

/**
 * question
 * 请实现一个函数，将一个字符串中的空格替换成“%20”
 */

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String str1 = new String(str);
        return str1.replace(" ", "%20");
    }
}
