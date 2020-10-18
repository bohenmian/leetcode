package com.leetcode.array;

public class HasGroupsSizeX {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) return false;
        int[] count = new int[10001];
        for (int value : deck) {
            count[value]++;
        }
        int groupSize = count[0];
        for (int i = 1; i < count.length; i++) groupSize = gcd(count[i], groupSize);
        return groupSize >= 2;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
