package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

    private final CombinationSum combinationSum = new CombinationSum();

    @Test
    public void should_return_all_path_can_combination_sum() {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> result = combinationSum.combinationSum(candidates, 7);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> path = List.of(2, 2, 3);
        List<Integer> path1 = List.of(7);
        expected.add(path);
        expected.add(path1);
        assertEquals(result, expected);
    }
}
