package com.leetcode.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!deque.isEmpty()) {
                deque.addFirst(deque.pollLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            result[i] = deque.poll();
        }
        return result;
    }

    public int[] deckRevealedIncreasingInOtherWay(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        int deckLength = deck.length;
        for (int i = 0; i < deckLength; i++) {
            queue.add(i);
        }
        int[] result = new int[deckLength];
        for (int value : deck) {
            result[queue.poll()] = value;
            queue.add(queue.poll());
        }
        return result;
    }
}
