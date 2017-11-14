package com.nowcoder.common;

/**
 * 输入数字n,按顺序打印出从1到最大的n位十进制数，比如输入3,则打印出1,2,3一直到最大的3位数即999.
 * tip 大数问题转换为字符数组或者整数数组解决
 * 递归方法,全排列
 */

public class PrintMaxNumber1 {

    void PrintToMaxOfDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n + 1];
        number[n] = '\0';
        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            PrintToMaxOfNDigitsRecursively(number, n, 0);
        }
    }

    void PrintToMaxOfNDigitsRecursively(char[] number, int length, int index) {
        if (index == length - 1) {
            PrintNumber(number);
            return;
        }
        for (int i = 0; i< 10; i++) {
            number[index + 1] = (char) (i + '0');
            PrintToMaxOfNDigitsRecursively(number, length, index + 1);
        }
    }

    public static void PrintNumber(char[] numbers) {
        PrintMaxNumber.PrintNumber(numbers);
    }

}
