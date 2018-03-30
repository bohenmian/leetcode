package com.leetcode.string;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 */

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {

    //这种方法每次均移动一个位置,如abcdc12345中c不匹配时,则left++匹配b
    public static int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        int left = 0, right = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (left < s.length() && right < s.length()) {
            if (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left++));
            } else {
                hashSet.add(s.charAt(right++));
                maxLength = Math.max(maxLength, right - left);
            }
        }
        return maxLength;
    }

    //这种方法直接移动到不匹配元素的下一个字符,即map.get(s.charAt(i)) + 1
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        int leftBound = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                leftBound = Math.max(map.get(s.charAt(i)) + 1, leftBound);
            }
            maxLength = Math.max(maxLength, i - leftBound + 1);
            map.put(s.charAt(i), i);
        }
        return maxLength;

    }


    public static void main(String[] args) {
        String s = "pwwk";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
