package com.algorithm.nowcoder.recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JumpFloorTest {

    private JumpFloor jumpFloor = new JumpFloor();

    @Test
    public void test_jumpFloor_when_target_more_than_2() throws Exception {
        int target = 4;
        int result = jumpFloor.JumpFloor(target);
        assertThat(result, is(5));
    }

    @Test
    public void test_jumpFloor_when_target_less_than_0() throws Exception {
        int target = -1;
        int result = jumpFloor.JumpFloor(target);
        assertThat(result, is(-1));
    }

    @Test
    public void test_jumpFloor_when_target_in_2() throws Exception {
        int target = 1;
        int result = jumpFloor.JumpFloor(target);
        assertThat(result, is(target));
    }


}