package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPartitionTest {

    private ArrayPartition partition = new ArrayPartition();

    @Test
    public void should_return_the_pair_max_sum() {
        int[] nums = new int[]{1, 4, 3, 2};
        int result = partition.arrayPairSum(nums);
        assertEquals(4, result);
    }
}
