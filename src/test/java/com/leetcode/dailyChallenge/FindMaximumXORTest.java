package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaximumXORTest {

    private final FindMaximumXOR findMaximumXOR = new FindMaximumXOR();

    @Test
    public void should_return_the_maximum_xor_value() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int result = findMaximumXOR.findMaximumXOR(nums);
        assertEquals(28, result);
    }

    @Test
    public void should_return_the_maximum_xor_value_in_trie_tree() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int result = findMaximumXOR.findMaximumXORInOtherWay(nums);
        assertEquals(28, result);
    }


}
