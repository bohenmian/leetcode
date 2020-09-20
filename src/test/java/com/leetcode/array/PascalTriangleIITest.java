package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PascalTriangleIITest {

    private final PascalTriangleII pascalTriangleII = new PascalTriangleII();

    @Test
    public void should_return_the_pascal_triangle() {
        List<Integer> result = pascalTriangleII.getRow(3);
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, result);
    }
}
