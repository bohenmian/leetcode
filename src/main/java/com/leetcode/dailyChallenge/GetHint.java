package com.leetcode.dailyChallenge;

public class GetHint {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] bucket = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                bulls++;
                continue;
            }
            bucket[s]++;
            bucket[g]--;
        }
        for (int j : bucket) {
            if (j > 0) {
                cows += j;
            }
        }
        cows = secret.length() - cows - bulls;
        return bulls + "A" + cows + "B";
    }

    public String getHintInOtherWay(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] secrets = new int[10];
        int[] guesses = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                bulls++;
            } else {
                secrets[s]++;
                guesses[g]++;
            }
        }
        for (int i = 0; i < secrets.length; i++) {
            cows += Math.min(secrets[i], guesses[i]);
        }
        return bulls + "A" + cows + "B";
    }

    public String getHintThreeWay(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] bucket = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) bulls++;
            else {
                // 说明guess里面出现过,和secret当前的数匹配
                if (bucket[s] < 0) cows++;
                // 说明secret里面出现过,和guess当前的数匹配
                if (bucket[g] > 0) cows++;
                // 记录secret中出现过的
                bucket[s]++;
                // 记录guess中出现过的
                bucket[g]--;

                // 上面四行可以合并为
//                if (bucket[s]++ < 0) cows++;
//                if (bucket[s]-->0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
