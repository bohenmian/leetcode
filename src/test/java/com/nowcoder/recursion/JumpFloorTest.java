package com.nowcoder.recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JumpFloorTest {

    private JumpFloor jumpFloor = new JumpFloor();

    @Test
    public void jumpFloor() throws Exception {
        int target = 4;
        int result = jumpFloor.JumpFloor(target);
        assertThat(result, is(5));
    }

}