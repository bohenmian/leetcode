package com.algorithm.nowcoder.string;

public class Solution {

    int[] hashTable = new int[256];
    StringBuffer stringBuffer = new StringBuffer();

    public void Insert(char ch)
    {
        stringBuffer.append(ch);
        if (hashTable[ch] == 0) {
            hashTable[ch] = 1;
        } else {
            hashTable[ch] += 1;
        }
    }
    public char FirstAppearingOnce()
    {
        char[] str = stringBuffer.toString().toCharArray();
        for (char c : str) {
            if (hashTable[c] == 1) {
                return c;
            }
        }
        return '#';
    }
}
