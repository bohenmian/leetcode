package com.nowcoder.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFindTest {

    private ArrayFind arrayFind = new ArrayFind();

    @Test
    public void test_find_when_number_exit() throws Exception {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int target = 5;
        boolean result = arrayFind.find(target, array);
        assertTrue(result);
    }

    @Test
    public void test_find_when_number_not_exit() throws Exception {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int target = 7;
        boolean result = arrayFind.find(target, array);
        assertFalse(result);
    }

}