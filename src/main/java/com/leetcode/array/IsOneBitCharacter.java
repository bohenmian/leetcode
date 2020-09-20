package com.leetcode.array;

public class IsOneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        int index = bits.length - 2;
        while (index >= 0 && bits[index] > 0) index--;
        return (bits.length - index) % 2 == 0;
    }
}
