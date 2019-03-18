package com.javaPlus.java.lambda.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFilteringWithinLambda {

    // 不采用lambda对元素进行过滤
    public static void main(String[] args) {
        List<String> words = Arrays.asList("spring", "node", "java");
        List<String> filterWords = getFilterWords(words, "node");

        for (String word : filterWords) {
            System.out.println(word);
        }
    }

    private static List<String> getFilterWords(List<String> words, String filterWord) {
        List<String> filterWords = new ArrayList<>();
        for (String word : words) {
            if (!word.equals(filterWord)) {
                filterWords.add(word);
            }
        }
        return filterWords;
    }
}
