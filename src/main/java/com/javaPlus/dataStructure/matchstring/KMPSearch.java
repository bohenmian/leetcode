package com.javaPlus.dataStructure.matchstring;

public class KMPSearch {

    public int KMPSearch(String text, String pattern) {
        int textIndex = 0;
        int patternIndex = 0;
        int[] next = getNext(pattern);
        while (textIndex < text.length() && patternIndex < pattern.length()) {
            if (patternIndex == -1 || text.charAt(textIndex) == pattern.charAt(patternIndex)) {
                textIndex++;
                patternIndex++;
            } else {
                patternIndex = next[patternIndex];
            }
        }
        if (patternIndex == pattern.length() - 1) {
            return textIndex - patternIndex;
        }
        return -1;
    }

    private int[] getNext(String pattern) {
        int[] next = new int[pattern.length()];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < pattern.length() - 1) {
            if (k == -1 || pattern.charAt(k) == pattern.charAt(j)) {
                ++k;
                ++j;
                //这里等价于if(p[j] = p[ next[j] ])
                if (pattern.charAt(k) == pattern.charAt(j)) {
                    // 这里经过优化需要多滑动一次
                    next[j] = next[k];
                } else {
                    // 这里滑动一次
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
