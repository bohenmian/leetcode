package com.leetcode.dailyChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array/solution/li-yong-yi-huo-yun-suan-de-xing-zhi-tan-xin-suan-f/
 */

public class FindMaximumXOR {

    public int findMaximumXOR(int[] nums) {
        int result = 0;
        int mask = 0;
        for (int i = 30; i >= 0; i--) {
            // the first element is 1000000000000000000000000000000 2 ^ 31
            // the second element is 1100000000000000000000000000000 2 ^ 31 + 2 ^ 30
            // the third element is 1110000000000000000000000000000 2 ^ 31 + 2 ^ 30 + 2 ^ 29
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();

            // 保留最高位
            for (int value : nums) {
                // 每个数的高位,即25位与后等于1111111111111111111111111110000 & 11001 = 16
                // 5 -> 101
                // 10 -> 1010
                set.add(value & mask);
            }

            // the first temp is 16
            // the second temp is 24
            int temp = result | (1 << i);
            for (int prefix : set) {
                // a ^ b = c ，则 a ^ c = b，且 b ^ c = a
                // 这里只有prefix最大值能得到result
                if (set.contains(prefix ^ temp)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }


    private class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    public int findMaximumXORInOtherWay(int[] nums) {
        TrieNode root = new TrieNode();
        // init trie
        for (int value : nums) {
            TrieNode curr = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (value >>> i) & 1;
                if (curr.children[bit] == null) {
                    curr.children[bit] = new TrieNode();
                }
                curr = curr.children[bit];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int value : nums) {
            TrieNode curr = root;
            int sum = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (value >>> i) & 1;
                if (curr.children[bit ^ 1] != null) {
                    sum += (1 << i);
                    curr = curr.children[bit ^ 1];
                } else {
                    curr = curr.children[bit];
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }


}
