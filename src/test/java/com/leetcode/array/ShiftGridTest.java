package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShiftGridTest {

    private final ShiftGrid shiftGrid = new ShiftGrid();

    @Test
    public void should_return_the_shift_grid() {
        List<List<Integer>> result = shiftGrid.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(9, 1, 2));
        expect.add(Arrays.asList(3, 4, 5));
        expect.add(Arrays.asList(6, 7, 8));
        assertEquals(expect, result);
    }
}
