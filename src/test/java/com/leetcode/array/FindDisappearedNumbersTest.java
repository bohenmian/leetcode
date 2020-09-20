package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDisappearedNumbersTest {

    private final FindDisappearedNumbers numbers = new FindDisappearedNumbers();

    @Test
    public void should_return_the_disappear_number() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = numbers.findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(5, 6);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_the_disappear_number_other_way() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = numbers.findDisappearedNumbersOtherWay(nums);
        List<Integer> expected = Arrays.asList(5, 6);
        assertEquals(expected, result);
    }
}
