package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumIdenticalPairsTest {

    private NumIdenticalPairs pairs = new NumIdenticalPairs();

    @Test
    public void should_return_the_num_identical_pairs() {
        int[] numbers = new int[]{1, 2, 3, 1, 1, 3};
        int pairs = this.pairs.numIdenticalPairs(numbers);
        assertEquals(4, pairs);
    }
}
