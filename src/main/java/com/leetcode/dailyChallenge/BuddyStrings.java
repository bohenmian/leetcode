package com.leetcode.dailyChallenge;

public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                if (A.indexOf(A.charAt(i), i + 1) != -1) return true;
            }
        }
        int index1 = -1;
        int index2 = -1;
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
                if (count == 1) index1 = i;
                else if (count == 2) index2 = i;
                else return false;
            }
        }
        return count == 2 && A.charAt(index1) == B.charAt(index2) && A.charAt(index2) == B.charAt(index1);
    }

}
