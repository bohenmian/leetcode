package com.leetcode.dailyChallenge;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindRepeatedDnaSequencesTest {

    private final FindRepeatedDnaSequences sequences = new FindRepeatedDnaSequences();

    @Test
    public void should_return_the_repeated_dna_sequences() {
        List<String> result = sequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        List<String> expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        assertEquals(expected, result);
    }
}
