package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindTheDistanceValueTest {

    private final FindTheDistanceValue value = new FindTheDistanceValue();

    @Test
    public void should_return_the_count_that_match_the_distance() {
        int count = value.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2);
        assertEquals(2, count);
    }

    @Test
    public void should_return_the_count_that_match_the_distance_other_way() {
        int count = value.findTheDistanceValueInOtherWay(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3);
        assertEquals(2, count);
    }
}
