package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int gridLength = rows * cols;
        int index = gridLength - k;
        // when k is several times of gridLength
        while (index < 0)
            index += gridLength;
        // find the shift grid start index
        index++;
        for (int i = 0; i < gridLength; i++) {
            list.add(grid[(index + i - 1) % gridLength / cols][(index + i - 1) % gridLength % cols]);
            if ((i + 1) % cols == 0) {
                result.add(list);
                list = new ArrayList<>();
            }
        }
        return result;
    }
}
