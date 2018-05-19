package com.algorithm.leetcode.common;


public class ConvertToTitle {

    //将十进制数转换为二进制数
    public String convertToTitle(int n) {
        if (n <= 0) {
            return null;
        }
        String result = "";
        while (n != 0) {
            //因为下标从1开始,所有要减1
            result = (char) ((n - 1) % 26 + 'A') + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}
