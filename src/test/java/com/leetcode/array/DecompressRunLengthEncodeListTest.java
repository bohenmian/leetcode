package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecompressRunLengthEncodeListTest {

    private DecompressRunLengthEncodeList list = new DecompressRunLengthEncodeList();

    @Test
    public void decompressRLElist() {
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] result = list.decompressRLElist(numbers);
        assertArrayEquals(new int[]{2, 4, 4, 4}, result);
    }
}
