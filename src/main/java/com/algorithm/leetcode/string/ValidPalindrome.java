package com.algorithm.leetcode.string;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return true;
        }
        int low = 0;    //头指针
        int high = s.length() - 1;  //尾指针
        while (low < high) {    //当两个指针相遇终止循环
            char lowCharacter = s.charAt(low);
            //判断是不是字符元素
            while ((lowCharacter < '0' || lowCharacter > '9') && (lowCharacter < 'A' || lowCharacter > 'Z') && (lowCharacter < 'a' || lowCharacter > 'z')) {
                if (low >= high) {
                    break;
                }
                low++;
                lowCharacter = s.charAt(low);   //从前到后寻找第一个字符元素
            }
            char highCharacter = s.charAt(high);
            //判断是不是字符元素
            while ((highCharacter < '0' || highCharacter > '9') && (highCharacter < 'A' || highCharacter > 'Z') && (highCharacter < 'a' || highCharacter > 'z')) {
                if (low >= high) {
                    break;
                }
                high--;
                highCharacter = s.charAt(high);     //从后到前寻找第一个字符元素
            }

            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }
            low++;      //当首尾两个元素匹配时移动指针
            high--;
        }
        return true;
    }
}
