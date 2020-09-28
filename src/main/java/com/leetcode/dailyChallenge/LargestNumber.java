package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, new LargestNumberComparator());

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String number : str) {
            largestNumber.append(number);
        }
        return largestNumber.toString();
    }

    private static class LargestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    }
}
