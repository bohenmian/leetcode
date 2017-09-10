package com.nowcoder.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test_sum_Solution_when_number_not_0() throws Exception {
        int n = 5;
        int result = solution.Sum_Solution(n);
        assertEquals(result, 15);
    }

    @Test
    public void test_sum_Solution_when_number_is_0() throws Exception {
        int n = 0;
        int result = solution.Sum_Solution(n);
        assertEquals(result, 0);
    }

}