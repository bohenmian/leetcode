package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddToArrayFormTest {

    private final AddToArrayForm form = new AddToArrayForm();

    @Test
    public void should_return_the_add_array_form() {
        int[] a = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        List<Integer> result = form.addToArrayFormOtherWay(a, 1);
        List<Integer> expected = Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(expected, result);
    }
}
