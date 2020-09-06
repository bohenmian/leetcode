package com.leetcode.array;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LuckyNumbersTest {

    private final LuckyNumbers numbers = new LuckyNumbers();

    @Test
    public void should_return_the_lucky_number() {
        int[][] matrix = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> result = numbers.luckyNumbers(matrix);
        assertEquals(15, result.get(0).intValue());
    }
}
