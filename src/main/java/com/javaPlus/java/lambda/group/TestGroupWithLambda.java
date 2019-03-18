package com.javaPlus.java.lambda.group;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGroupWithLambda {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");

        // 对List分组,并显示每组的个数
        Map<String, Long> itemCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(itemCount);


        // 对对象的字段进行分组
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orange", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> countMap = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

        System.out.println(countMap);

        Map<String, Integer> sumMap = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));

        System.out.println(sumMap);

    }

}
