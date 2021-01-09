package com.leetcode.array;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PancakeSortTest {

    private final PancakeSort sort = new PancakeSort();

    @Test
    public void should_return_the_pancake_sort_array() {
        int[] arr = {3, 2, 4, 1};
        List<Integer> result = sort.pancakeSort(arr);
        List<Integer> expected = List.of(3, 4, 2, 3, 1, 2, 1, 1);
        assertEquals(expected, result);
    }
}
