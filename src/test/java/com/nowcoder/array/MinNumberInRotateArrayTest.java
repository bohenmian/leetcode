package com.nowcoder.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinNumberInRotateArrayTest {
    private MinNumberInRotateArray minNumberInRotateArray = new MinNumberInRotateArray();

    @Test
    public void test_minNumberInRotateArray_when_array_normal() throws Exception {
        int[] array = {3, 4, 5, 1, 2};
        int result = minNumberInRotateArray.minNumberInRotateArray(array);
        assertThat(result, is(0));
    }

    @Test
    public void test_minNumberInRotateArray_when_array_unnormal() throws Exception {
        int[] array = {1, 1, 1, 0, 1};
        int result = minNumberInRotateArray.minNumberInRotateArray(array);
        assertThat(result, is(0));
    }
}