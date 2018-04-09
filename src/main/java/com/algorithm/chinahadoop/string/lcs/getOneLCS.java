package com.algorithm.chinahadoop.string.lcs;

/**
 * 两个序列X和Y的公共子序列中,长度最长的那个,定义为X和Y的最长公共子序列
 * 字符串13455与245576的最长公共子序列为455
 */


public class getOneLCS {

    public static void getLCS(String substring1, String substring2) {
        int substringLength1 = substring1.length();
        int substringLength2 = substring2.length();
        int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];
        //构造棋盘
        for (int i = substringLength1 - 1; i >= 0; i--) {
            for (int j = substringLength2 - 1; j >= 0; j--) {
                if (substring1.charAt(i) == substring2.charAt(j)) {
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                } else {
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
                }
            }
        }
        System.out.println("substring1:" + substring1);
        System.out.println("substring2:" + substring2);
        System.out.print("getOneLCS:");
        int i = 0, j = 0;
        while (i < substringLength1 && j < substringLength2) {
            if (substring1.charAt(i) == substring2.charAt(j)) {
                System.out.print(substring1.charAt(i));
                i++;
                j++;
            } else if (opt[i + 1][j] >= opt[i][j + 1]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        String substring1 = "ABCBDAB";
        String substring2 = "BDCABA";
        getLCS(substring1, substring2);
    }

}
