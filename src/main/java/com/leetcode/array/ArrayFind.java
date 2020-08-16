package com.leetcode.array;

/**
 * question:
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class ArrayFind {
    public boolean find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length - 1;
        int row = 0;
        while (row < rows && cols >= 0) {
            if (array[row][cols] > target) {
                cols--;
            } else if (array[row][cols] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
