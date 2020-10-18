package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    List<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
    }

    public int ping(int t) {
        list.add(t);
        while (list.get(0) < t - 3000) list.remove(0);
        return list.size();
    }
}
