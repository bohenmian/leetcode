package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductTest {

    private final MaximumProduct product = new MaximumProduct();

    @Test
    public void should_return_the_maximum_product() {
        int result = product.maximumProduct(new int[]{-8, -5, -5, -4, 6, 6});
        assertEquals(240, result);
    }
}
