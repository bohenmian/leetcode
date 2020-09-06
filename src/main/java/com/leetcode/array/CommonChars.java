package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] temp = new int[26];
        int[] hash = new int[26];
        for (int i = 0; i < 26; i++)
            // init the min size
            hash[i] = 100;
        for (String s : A) {
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                hash[j] = Math.min(temp[j], hash[j]);
                // 每次都要重新给一个新的temp数组来统计word里面char出现的数量
                temp[j] = 0;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (hash[i] > 0) {
                list.add(String.valueOf((char) (i + 'a')));
                hash[i]--;
            }
        }
        return list;
    }
}
