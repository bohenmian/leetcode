package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitwiseComplementTest {

    private final BitwiseComplement complement = new BitwiseComplement();

    @Test
    public void should_return_the_bitwise_complement() {
        int result = complement.bitwiseComplement(10);
        assertEquals(5, result);
    }
}
