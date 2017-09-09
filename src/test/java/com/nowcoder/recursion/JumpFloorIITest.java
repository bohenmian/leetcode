package com.nowcoder.recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JumpFloorIITest {

    private JumpFloorII jumpFloorII = new JumpFloorII();

    @Test
    public void test_jumpFloorII_when_number_less_than_0() throws Exception {
        int target = -1;
        int result = jumpFloorII.JumpFloorII(target);
        assertThat(result, is(-1));
    }

    @Test
    public void test_jumpFloorII_when_number_equal_1() throws Exception {
        int target = 1;
        int result = jumpFloorII.JumpFloorII(target);
        assertThat(result, is(target));
    }

    @Test
    public void test_jumpFloorII_when_number_more_than_1() throws Exception {
        int target = 3;
        int result = jumpFloorII.JumpFloorII(target);
        assertThat(result, is(4));
    }



}