package com.algorithm.nowcoder.common.movingCount;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */

public class MoveCount {

    public int movingCount(int threshold, int rows, int cols) {
        int[][] visit = new int[rows][cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visit);
    }

    public int movingCountCore(int threshold, int rows, int cols, int row, int col, int[][] visit) {
        int count = 0;
        int index = row * cols + col;
        if (row < 0 || row >= rows || col < 0 || col >= cols || getDigitSum(col) + getDigitSum(row) > threshold || visit[row][col] == 1 || threshold < 0) {
            return 0;
        }
        visit[row][col] = 1;
        return movingCountCore(threshold, rows, cols, row - 1, col, visit) + movingCountCore(threshold, rows, cols, row + 1, col, visit) +
                movingCountCore(threshold, rows, cols, row, col - 1, visit) + movingCountCore(threshold, rows, cols, row, col + 1, visit) + 1;
    }

    public int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
