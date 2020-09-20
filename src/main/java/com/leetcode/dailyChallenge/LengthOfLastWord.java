package com.leetcode.dailyChallenge;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }

    public int lengthOfLastWordOtherWay(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public int lengthOfLastWordThreeWay(String s) {
        int end = s.length() - 1;
        int count = 0;
        if (s.length() == 0) {
            return 0;
        }
        while (end >= 0) {
            if (s.charAt(end--) != ' ') {
                count++;
            } else {
                return count;
            }
        }
        return 0;
    }
}
