package com.nowcoder.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumberOfOneTest {

    private CountNumberOfOne countNumberOfOne = new CountNumberOfOne();

    @Test
    public void test_nubberOf1_when_number_is_0() throws Exception {
        int n = 0;
        int result = countNumberOfOne.NumberOf1(n);
        assertEquals(result, 0);
    }

    @Test
    public void test_nubberOf1_when_number_is_15() throws Exception {
        int n = 15;
        int result = countNumberOfOne.NumberOf1(n);
        assertEquals(result, 4);
    }

}