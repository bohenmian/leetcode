package com.nowcoder.common.robotPath;

import org.junit.Test;

import static org.junit.Assert.*;

public class HasPathTest {

    private HasPath hasPath = new HasPath();


    @Test
    public void hasPath() throws Exception {
        String strs = "ABCESFCSADEE";
        char[] matrix = strs.toCharArray();
        int rows = 3;
        int cols = 4;
        String str = "A";
        boolean result = hasPath.hasPath(matrix, rows, cols, str.toCharArray());
        assertTrue(result);
    }

}