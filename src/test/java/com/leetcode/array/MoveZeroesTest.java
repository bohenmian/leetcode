package com.leetcode.array;

import org.junit.Test;

public class MoveZeroesTest {

    public final MoveZeroes zeroes = new MoveZeroes();

    @Test
    public void should_return_the_move_zeroes() {
        int[] nums = new int[]{0, 1, 3, 1, 12};
        zeroes.moveZeroes(nums);
    }
}
