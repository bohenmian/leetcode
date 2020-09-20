package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindKthPositiveTest {

    private final FindKthPositive positive = new FindKthPositive();

    @Test
    public void should_return_the_kth_positive() {
        int[] arr = {2, 3, 4, 7, 11};
        int result = positive.findKthPositive(arr, 5);
        assertEquals(9, result);
    }

    @Test
    public void should_return_the_kth_positive_other_way() {
        int[] arr = {2, 3, 4, 7, 11};
        int result = positive.findKthPositiveOtherWay(arr, 5);
        assertEquals(9, result);
    }

    @Test
    public void should_return_the_kth_positive_three_way() {
        int[] arr = {2, 3, 4, 7, 11};
        int result = positive.findKthPositiveThreeWay(arr, 5);
        assertEquals(9, result);
    }
}
