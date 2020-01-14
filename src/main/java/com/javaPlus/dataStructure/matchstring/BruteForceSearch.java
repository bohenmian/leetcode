package com.javaPlus.dataStructure.matchstring;

public class BruteForceSearch {

    public int BruteForceSearch(String text, String pattern) {
        int textIndex = 0;
        int patternIndex = 0;
        while (textIndex <= text.length() - pattern.length() && patternIndex < pattern.length()) {
            if (text.charAt(textIndex + patternIndex) == pattern.charAt(patternIndex)) {
                patternIndex++;
            } else {
                textIndex++;
                patternIndex = 0;
            }
        }
        if (patternIndex >= pattern.length()) {
            return textIndex;
        }
        return -1;
    }
}
