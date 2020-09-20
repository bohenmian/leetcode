package com.leetcode.dailyChallenge;

public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        String[] words1 = version1.split("\\.");
        String[] words2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        while (i < words1.length || j < words2.length) {
            int num1 = Integer.parseInt(i < words1.length ? words1[i] : "0");
            int num2 = Integer.parseInt(i < words2.length ? words2[j] : "0");
            // if the number is more than Integer.MAX_VALUE, need to compare the string
            int value = Integer.compare(num1, num2);
            if (value == 0) {
                i++;
                j++;
            } else {
                return value;
            }
        }
        return 0;
    }

    public int compareVersionInOtherWay(String version1, String version2) {
        String[] words1 = version1.split("\\.");
        String[] words2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        while (i < words1.length || j < words2.length) {
            String num1 = i < words1.length ? words1[i] : "0";
            String num2 = i < words2.length ? words2[j] : "0";
            int value = compare(num1, num2);
            if (value == 0) {
                i++;
                j++;
            } else {
                return value;
            }
        }
        return 0;
    }

    private int compare(String word1, String word2) {
        String string1 = removeFrontZero(word1);
        String string2 = removeFrontZero(word2);
        if (string1.length() > string2.length()) {
            return 1;
        } else if (string1.length() < string2.length()) {
            return -1;
        } else {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) > string2.charAt(i)) {
                    return 1;
                } else if (string1.charAt(i) < string2.charAt(i)) {
                    return -1;
                }
            }
        }
        return 0;

    }

    private String removeFrontZero(String word) {
        int start = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '0') {
                start++;
            } else {
                break;
            }
        }
        return word.substring(start);
    }
}
