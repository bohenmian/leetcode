package com.algorithm.test;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        long k = Integer.parseInt(line[2]);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("a");
        }
        for (int j = 0; j < m; j++) {
            builder.append("z");
        }
        char[] chars = builder.toString().toCharArray();
        if (k <= 0) {
            System.out.println("-1");
            return;
        }
        if (k == 1) {
            System.out.println(String.valueOf(chars));
            return;
        }
        long count = 1;
        while (count <= k) {
            String reverseString = String.valueOf(chars);
            Permutation(chars, chars.length);
            if (count == k) {
                System.out.println(String.valueOf(chars));
                return;
            }
            if (reverseString.equals(String.valueOf(chars))) {
                System.out.println("-1");
                return;
            }
            count++;
        }
        System.out.println("-1");
    }

    private static boolean Permutation(char[] chars, int size) {
        int i = size - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = size - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }
        swap(chars, i, j);
        Reverse(chars, i + 1, size - 1);
        return true;
    }

    private static void swap(char[] s, int m, int n) {
        char temp = s[m];
        s[m] = s[n];
        s[n] = temp;
    }

    private static void Reverse(char[] s, int from, int to) {
        while (from < to) {
            char temp = s[from];
            s[from++] = s[to];
            s[to--] = temp;
        }
    }
}
