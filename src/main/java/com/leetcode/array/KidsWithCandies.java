package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        int extraCandy = max - extraCandies;
        for (int candy : candies) {
            result.add(candy >= extraCandy);
        }
        return result;
    }
}
