package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    private final PascalTriangle triangle = new PascalTriangle();

    @Test
    public void should_return_the_pascal_triangle() {
        List<List<Integer>> result = triangle.generate(3);
        List<List<Integer>> excepted = new ArrayList<>();
        excepted.add(Collections.singletonList(1));
        excepted.add(Arrays.asList(1, 1));
        excepted.add(Arrays.asList(1, 2, 1));
        assertEquals(excepted, result);
    }
}
