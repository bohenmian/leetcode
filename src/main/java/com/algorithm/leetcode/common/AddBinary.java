package com.algorithm.leetcode.common;

public class AddBinary {

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        int carry = 0;
        String result = "";
        while (pb >= 0) {
            int sum = (a.charAt(pa) - '0') + (b.charAt(pb) - '0') + carry;      //计算对应两个相加的和
            result = (String.valueOf(sum % 2) + result);        //计算相加后这一位的数字,并连接它的后一位数字,注意本位和后以为数字相加的结果不能反
            carry = sum / 2;      //计算进位
            pa--;
            pb--;
        }
        while (pa >= 0) {       //处理a字符串较长的情况
            int sum = (a.charAt(pa) - '0') + carry;
            result = (String.valueOf(sum % 2) + result);
            carry = sum / 2;
            pa--;
        }
        if (carry == 1) {
            result = "1" + result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
