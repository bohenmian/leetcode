package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxProductTest {

    private final MaxProduct product = new MaxProduct();

    @Test
    public void should_return_the_max_product() {
        int[] nums = new int[]{1, 5, 4, 5};
        int result = product.maxProduct(nums);
        assertEquals(16, result);
    }
}
