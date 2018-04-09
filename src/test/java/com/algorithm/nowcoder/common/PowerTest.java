package com.algorithm.nowcoder.common;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PowerTest {
    private Power power = new Power();

    @Test
    public void test_power_when_base_is_0() throws Exception {
        double base = 0;
        int exponent = 10;
        double result = power.Power(base, exponent);
        assertThat(result, is(Double.valueOf(0)));
    }

    @Test
    public void test_power_when_exponent_is_1() throws Exception {
        double base = 10;
        int exponent = 1;
        double result = power.Power(base, exponent);
        assertThat(result, is(Double.valueOf(10)));
    }

    @Test
    public void test_power_when_base_is_2_and_exponent_is_5() throws Exception {
        double base = 2;
        int exponent = 5;
        double result = power.Power(base, exponent);
        assertThat(result, is(Double.valueOf(32)));
    }

}