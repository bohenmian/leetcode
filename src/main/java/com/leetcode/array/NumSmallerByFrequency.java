package com.leetcode.array;

public class NumSmallerByFrequency {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordMapping = new int[11];
        for (String word : words) {
            wordMapping[f(word)]++;
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = sum(f(queries[i]), wordMapping);
        }
        return result;
    }

    private int sum(int c, int[] arr) {
        int sum = 0;
        for (int i = c + 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private int f(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        for (int j : count) {
            if (j != 0) {
                return j;
            }
        }
        return 0;
    }
}
