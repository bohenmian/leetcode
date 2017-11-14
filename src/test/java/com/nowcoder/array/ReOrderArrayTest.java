package com.nowcoder.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReOrderArrayTest {
    private ReOrderArray reOrderArray = new ReOrderArray();

    @Test
    public void test_reOrderArray_when_array_is_null() throws Exception {
        int[] array = null;
        int[] result = reOrderArray.reOrderArray(array);
        assertArrayEquals(result, null);
    }

    @Test
    public void test_reOrderArray_when_array_is_common() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = reOrderArray.reOrderArray(array);
        int[] reOrderArray = {1, 7, 3, 5, 4, 6, 2};
        assertArrayEquals(result, reOrderArray);
    }

    @Test
    public void test_reOrderArray_when_array_is_all_odd_number() throws Exception {
        int[] array = {1, 3, 5, 7, 9};
        int[] result = reOrderArray.reOrderArray(array);
        int[] reOrderArray = {1, 3, 5, 7, 9};
        assertArrayEquals(result, reOrderArray);
    }
}