package com.javaPlus.java.lambda.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMapWithLambda {

    public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> list = Arrays.asList("a", "d", "e", "f");
        List<List<String>> collection2 = Arrays.asList(list);
        List<String> result = new ArrayList<>();

        // 求collection1和collection2中相同的元素
        // 将List<List<String>>转化为List<String>
        result = collection1.stream()
                .filter(word -> collection2.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
                        .contains(word))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
