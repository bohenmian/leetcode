package com.nowcoder.common;

/**
 * 输入数字n,按顺序打印出从1到最大的n位十进制数，比如输入3,则打印出1,2,3一直到最大的3位数即999.
 * tip 大数问题转换为字符数组或者整数数组解决
 */

public class PrintMaxNumber {
    public static boolean increment(char[] numbers) {
        boolean isOverflow = false;
        int nTakeOver = 0;
        for (int i = numbers.length - 1; i >= 0; i++) {
            int sum = numbers[i] - '0' + nTakeOver;
            if (i == numbers.length - 1) {
                sum++;
            }
            if (sum >= 10) {
                if (i == 0) {
                    isOverflow = true;
                } else {
                    sum -= 10;
                    nTakeOver = 1;
                    numbers[i] = (char) ('0' + sum);
                }
            } else {
                numbers[i] = (char) ('0' + sum);
                break;
            }
        }
        return isOverflow;
    }

    public static void PrintNumber(char[] numbers) {
        boolean isBeginning = true;
        for (int i = 0; i < numbers.length; i++) {
            if (isBeginning && numbers[i] != '0') {
                isBeginning = false;
            }
            if (!isBeginning) {
                System.out.printf("%c", numbers[i]);
            }
        }
        System.out.println("\t");
    }
}
