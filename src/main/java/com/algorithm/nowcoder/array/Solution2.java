package com.algorithm.nowcoder.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution2 {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        if (size <= 0) {
            return arrayList;
        }
        for (int i = 0; i < num.length; i++) {
            if (!queue.isEmpty()) {
                if (i >= queue.peek() + size) {
                    queue.pop();
                }
            }
            while (!queue.isEmpty() && num[i] > num[queue.getLast()]) {
                queue.removeLast();
            }
            queue.offer(i);
            if (i + 1 >= size) {
                arrayList.add(num[queue.peek()]);
            }
        }
        return arrayList;
    }
}
