package com.leetcode.array;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductExceptSelfTest {

    private final ProductExceptSelf self = new ProductExceptSelf();

    @Test
    public void should_return_the_product_except_self() {
        int[] nums = {1, 2, 3, 4};
        int[] result = self.productExceptSelf(nums);
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, result);
    }
}
