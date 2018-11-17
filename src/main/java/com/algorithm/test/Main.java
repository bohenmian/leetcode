package com.algorithm.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        int countA = 0;
        int countB = 0;
        int i = 0;
        int lineLen = line.length() - 1;
        while (i != lineLen) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                countA++;
                i++;
            } else {
                i++;
                if (countA < countB) {
                    countA = 0;
                }
            }
            if (line.charAt(lineLen) == line.charAt(lineLen - 1)) {
                countB++;
                lineLen--;
            } else {
                lineLen--;
                if (countA > countB) {
                    countB = 0;
                }
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(line.charAt(i));
    }
}
