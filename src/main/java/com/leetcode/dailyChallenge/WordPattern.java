package com.leetcode.dailyChallenge;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;
        return wordPatternHelper(words).equals(wordPatternHelper(pattern.split("")));
    }

    private String wordPatternHelper(String[] arr) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (wordMap.containsKey(arr[i])) {
                builder.append(wordMap.get(arr[i]));
            } else {
                builder.append(i);
                wordMap.put(arr[i], i);
            }
        }
        return builder.toString();
    }

    public boolean wordPatternInOtherWay(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;
        String[] patterns = pattern.split("");
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            String s1 = patterns[i];
            int index1 = map1.getOrDefault(s, -1);
            int index2 = map2.getOrDefault(s1, -1);
            if (index1 != index2) {
                return false;
            } else {
                map1.put(s, i);
                map2.put(s1, i);
            }
        }
        return true;
    }
}
