package com.leetcode.dailyChallenge;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinDominoRotationsTest {

    private final MinDominoRotations rotations = new MinDominoRotations();

    @Test
    public void should_return_the_rotations_count() {
        int[] b = {5, 2, 6, 2, 3, 2};
        int[] a = {2, 1, 2, 4, 2, 2};
        int result = rotations.minDominoRotations(a, b);
        assertEquals(2, result);
    }
}
