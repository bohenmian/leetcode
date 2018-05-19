package com.algorithm.leetcode.common;

/**
 * 求阶乘结果中0的个数
 * 解题思路:0的个数来源于2和5相乘,而2的个数多于5,则计算5的个数
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {
        return n / 5 == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
