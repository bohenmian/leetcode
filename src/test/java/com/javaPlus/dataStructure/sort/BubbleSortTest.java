package com.javaPlus.dataStructure.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private final BubbleSort sort = new BubbleSort();

    @Test
    public void should_return_the_bubble_sort() {
        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        int[] result = sort.BubbleSort(arr);
        int[] expected = new int[]{0, 1, 2, 2, 3, 4, 4, 4, 4, 6, 8, 8, 9, 9, 10, 11, 23, 34, 54, 55, 77, 90};
        assertArrayEquals(expected, result);

    }
}
