package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ShuffleTest {

    private final Shuffle shuffle = new Shuffle();

    @Test
    public void should_return_the_shuffle_array_when_n_is_4() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int[] result = this.shuffle.shuffle(nums, 4);
        assertArrayEquals(result, new int[]{1, 4, 2, 3, 3, 2, 4, 1});
    }

    @Test
    public void should_return_the_shuffle_array_when_n_is_3() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int[] result = this.shuffle.shuffle(nums, 3);
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, result);
    }
}
