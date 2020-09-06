package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersWithEvenNumberOfDigitsTest {

    private final FindNumbersWithEvenNumberOfDigits test = new FindNumbersWithEvenNumberOfDigits();

    @Test
    public void should_return_the_even_number_of_digits() {
        int[] numbers = new int[]{12, 345, 2, 6, 7896};
        int result = test.findNumbers(numbers);
        assertEquals(2, result);
    }

    @Test
    public void should_return_the_even_number_of_digits_with_two_test() {
        int[] numbers = new int[]{555, 901, 482, 1771};
        int result = test.findNumbers(numbers);
        assertEquals(1, result);
    }
}
