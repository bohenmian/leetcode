package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellsWithOddValuesInMatrixTest {

    private final CellsWithOddValuesInMatrix matrix = new CellsWithOddValuesInMatrix();

    @Test
    public void should_return_the_number_of_cells_with_odd_values() {
        int[][] indices = {{0, 1}, {1, 1}};
        int result = matrix.oddCells(2, 3, indices);
        assertEquals(6, result);
    }

    @Test
    public void should_return_the_number_of_cells_with_odd_values_in_other_ways() {
        int[][] indices = {{1, 1}, {0, 0}};
        int result = matrix.oddCellsInOtherWay(2, 2, indices);
        assertEquals(0, result);
    }
}
