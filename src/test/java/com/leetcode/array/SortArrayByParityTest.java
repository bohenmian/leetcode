package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    private final SortArrayByParity parity = new SortArrayByParity();

    @Test
    public void should_return_an_array_that_even_elements_followed_by_the_odd_elements_of_A() {
        int[] nums = new int[]{3, 1, 2, 4};
        int[] result = parity.sortArrayByParity(nums);
        int[] expected = {2, 4, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_an_array_that_even_elements_followed_by_the_odd_element_of_A_in_other_test_case() {
        int[] nums = new int[]{3, 1, 2, 4};
        int[] result = parity.sortArrayByParityInOtherWays(nums);
        int[] expected = {2, 4, 1, 3};
        assertArrayEquals(expected, result);
    }
}
