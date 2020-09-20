package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrefixesDivBy5Test {

    private final PrefixesDivBy5 divBy5 = new PrefixesDivBy5();


    @Test
    public void should_return_the_prefix_divide_by_5() {
        List<Boolean> result = divBy5.prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1});
        List<Boolean> expected = Arrays.asList(true, false, false, false, true, false);
        assertEquals(expected, result);
    }
}
