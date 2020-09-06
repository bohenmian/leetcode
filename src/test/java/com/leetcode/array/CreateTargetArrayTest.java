package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class CreateTargetArrayTest {

    private final CreateTargetArray array = new CreateTargetArray();

    @Test
    public void should_return_the_create_target_array() {
        int[] result = array.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
        int[] expected = {0, 4, 1, 3, 2};
        assertArrayEquals(expected, result);
    }
}
