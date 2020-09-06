package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KidsWithCandiesTest {

    private final KidsWithCandies kidsWithCandies = new KidsWithCandies();

    @Test
    public void should_return_the_kid_with_the_greatest_number_of_candies() {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> result = kidsWithCandies.kidsWithCandies(candies, 3);
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        assertEquals(expected, result);
    }
}
