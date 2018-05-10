package com.algorithm.leetcode.common;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long result = 0;
        int temp = x;
        while (temp > 0) {
            result *= 10;
            result += temp % 10;
            if (result > Integer.MAX_VALUE) {
                return false;
            }
            temp /= 10;
        }
        if (result == x) {
            return true;
        }
        return false;
    }
}
