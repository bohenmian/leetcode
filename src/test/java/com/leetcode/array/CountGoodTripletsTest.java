package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountGoodTripletsTest {


    private final CountGoodTriplets triplets = new CountGoodTriplets();

    @Test
    public void should_return_the_good_triplets() {
        int result = triplets.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3);
        assertEquals(4, result);
    }
}
