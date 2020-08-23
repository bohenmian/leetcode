package com.leetcode.array;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class KidsWithCandiesTest {

    private final KidsWithCandies kidsWithCandies = new KidsWithCandies();

    @Test
    public void should_return_the_kid_with_the_greatest_number_of_candies() {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> kidsWithCandies = this.kidsWithCandies.kidsWithCandies(candies, 3);
        assertArrayEquals(new Boolean[]{true, true, true, false, true}, kidsWithCandies.toArray());
    }
}
