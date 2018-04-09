package com.algorithm.nowcoder.common;

public class Solution3 {

    public static int NumberOfXBetween1AndN_Solution(int n) {
        int count = 0;
        int i = 1;
        int current = 0, before = 0, after = 0;
        while ((n / i) != 0) {
            current = (n / i) % 10; //当前位
            before = n / (i * 10);  //高位
            after = n - (n / i) * 10; //低位
            if (current == 0) {
                count += before * i;
            } else if (current == 1) {
                count += before * i + after + 1;
            } else {
                count += (before + 1) * i;
            }
            i = i * 10;
        }
        return count;
    }

    //TODO

    public static void main(String[] args) {
        System.out.println(NumberOfXBetween1AndN_Solution(111));
    }
}
