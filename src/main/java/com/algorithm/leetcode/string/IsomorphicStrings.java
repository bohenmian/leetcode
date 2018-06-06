package com.algorithm.leetcode.string;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (t == null || s == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //如果包含c1,那么关于t的对应关系一定是c2
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
                //c1,c2中字符的对应关系
                map.put(c1, c2);
            }
        }
        return true;
    }
}