package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        if (num <= 1) {
            return;
        }
        for (int i = 0; i < num; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < num; j++) {
                if (sum > num) {
                    break;
                }
                sum = sum + j;
                list.add(j);
                if (sum == num) {
                    lists.add(list);
                    break;
                }
            }
        }
        System.out.println(lists);
    }
}
