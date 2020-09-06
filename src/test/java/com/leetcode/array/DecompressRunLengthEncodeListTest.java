package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecompressRunLengthEncodeListTest {

    private final DecompressRunLengthEncodeList list = new DecompressRunLengthEncodeList();

    @Test
    public void decompressRLElist() {
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] result = list.decompressRLElist(numbers);
        int[] expected = {2, 4, 4, 4};
        assertArrayEquals(expected, result);
    }
}
