package com.leetcode.array;

public class CountCharacters {

    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        char[] charsCount = countChars(chars.toCharArray());
        for (String word : words) {
            char[] countChars1 = countChars(word.toCharArray());
            for (int j = 0; j < countChars1.length; j++) {
                if (countChars1[j] > 0 && countChars1[j] > charsCount[j]) {
                    break;
                }
                if (j == charsCount.length - 1) {
                    sum += word.length();
                }
            }
        }
        return sum;
    }

    private char[] countChars(char[] charsToStringArray) {
        char[] charCount = new char[26];
        for (char c : charsToStringArray) {
            charCount[c - 'a']++;
        }
        return charCount;
    }

}
