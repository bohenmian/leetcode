package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationSum3Test {

    private final CombinationSum3 sum3 = new CombinationSum3();

    @Test
    public void should_return_the_combination_sum() {
        List<List<Integer>> result = sum3.combinationSum3(3, 9);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 6));
        expected.add(Arrays.asList(1, 3, 5));
        expected.add(Arrays.asList(2, 3, 4));
        assertEquals(expected, result);
    }
}
