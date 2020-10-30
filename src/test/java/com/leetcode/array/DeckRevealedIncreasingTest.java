package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DeckRevealedIncreasingTest {

    private final DeckRevealedIncreasing increasing = new DeckRevealedIncreasing();

    @Test
    public void should_return_deck_revealed_increasing() {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] result = increasing.deckRevealedIncreasing(deck);
        int[] expected = {2, 13, 3, 11, 5, 17, 7};
        assertArrayEquals(expected, result);
    }
}
