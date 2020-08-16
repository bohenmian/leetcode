package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DuplicateNumberTest {


    private DuplicateNumber duplicateNumber = new DuplicateNumber();

    @Test
    public void should_return_true_when_array_contain_duplicate_number() {
        int[] numbers = new int[]{2, 3, 1, 0, 2, 5, 3};
        boolean result = duplicateNumber.duplicate(numbers, numbers.length);
        assertTrue(result);
    }
}
