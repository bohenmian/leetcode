package com.algorithm.test;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] q = new int[m];
        for (int j = 0; j < m; j++) {
            q[j] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + a[j];
                if (q[i] <= sum) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
