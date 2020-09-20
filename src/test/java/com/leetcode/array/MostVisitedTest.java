package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostVisitedTest {

    private final MostVisited visited = new MostVisited();

    @Test
    public void should_return_the_most_visited() {
        int[] rounds = {1, 3, 1, 2};
        List<Integer> result = visited.mostVisited(4, rounds);
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, result);
    }
}
