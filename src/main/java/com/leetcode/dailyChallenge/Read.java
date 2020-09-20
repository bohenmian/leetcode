package com.leetcode.dailyChallenge;

class Read4 {
    public int read4(char[] chars) {
        return chars.length;
    }
}

public class Read extends Read4 {

    public int read(char[] buf, int n) {
        char[] temp = new char[4];
        int count = 0;
        while (true) {
            int size = read4(temp);
            for (int i = 0; i < size && count < n; i++) {
                buf[count++] = temp[i];
            }
            if (size == 0 || count == n) {
                return count;
            }
        }
    }
}
