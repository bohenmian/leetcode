package com.leetcode.dailyChallenge;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinHeightTreesTest {

    private final FindMinHeightTrees trees = new FindMinHeightTrees();

    @Test
    public void should_return_the_min_height_trees() {
        int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
        List<Integer> result = trees.findMinHeightTrees(6, edges);
        List<Integer> expected = List.of(3, 4);
        assertEquals(expected, result);
    }
}
