package com.leetcode.array;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DeckRevealedIncreasing {

    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        int[] result = new int[n];
        Arrays.sort(deck);
        for (int card : deck) {
            result[deque.pollFirst()] = card;
            if (!deque.isEmpty()) deque.add(deque.pollFirst());
        }
        return result;
    }
}
