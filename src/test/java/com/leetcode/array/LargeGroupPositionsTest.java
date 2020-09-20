package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeGroupPositionsTest {

    private final LargeGroupPositions positions = new LargeGroupPositions();

    @Test
    public void should_return_the_largest_group_positions() {
        List<List<Integer>> result = positions.largeGroupPositions("abcdddeeeeaabbbcd");
        List<Integer> position1 = Arrays.asList(3, 5);
        List<Integer> position2 = Arrays.asList(6, 9);
        List<Integer> position3 = Arrays.asList(12, 14);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(position1);
        expected.add(position2);
        expected.add(position3);
        assertEquals(expected, result);
    }
}
