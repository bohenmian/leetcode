package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RevealCardsInIncreasingOrderTest {

    private RevealCardsInIncreasingOrder order = new RevealCardsInIncreasingOrder();

    @Test
    public void should_revel_cards_in_increasing_order() {
        int[] sums = new int[]{17, 13, 11, 2, 3, 5, 7};
        int[] result = order.deckRevealedIncreasing(sums);
        assertArrayEquals(new int[]{2, 13, 3, 11, 5, 17, 7}, result);
    }

    @Test
    public void should_reveal_cards_in_increasing_order_in_other_test_case() {
        int[] sums = new int[]{17, 13, 11, 2, 3, 5, 7};
        int[] result = order.deckRevealedIncreasingInOtherWay(sums);
        assertArrayEquals(new int[]{2, 13, 3, 11, 5, 17, 7}, result);
    }
}
