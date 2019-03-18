package com.javaPlus.java.lambda.filter;

import com.javaPlus.java.lambda.sort.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilterWithLambda {

    public static void main(String[] args) {
        // 使用lambda对元素进行过滤(返回List)
        List<String> filterWords = Stream.of("spring", "node", "java")
                .filter(word -> !"node".equals(word))
                .collect(Collectors.toList());

        filterWords.forEach(System.out::println);

        // 使用filter和findAny来返回指定对象
        Developer developer = getDevelopers().stream()
                .filter(developer1 -> "tom".equals(developer1.getName()))
                .findAny()
                .orElse(null);
        System.out.println("name:" + developer.getName() + " salary:" + developer.getSalary() + " age:" + developer.getAge());

        String word = getDevelopers().stream()
                .filter(developer1 -> developer1.getName().equals("tom"))
                .map(Developer::getName)
                .findAny()
                .orElse(null);
        System.out.println(word);

        List<String> words = getDevelopers().stream()
                .filter(developer1 -> !developer1.getName().equals("tom"))
                .map(Developer::getName)
                .collect(Collectors.toList());

        words.forEach(System.out::println);
    }

    private static List<Developer> getDevelopers() {
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("tom", new BigDecimal("80000"), 20));
        developers.add(new Developer("jack", new BigDecimal("60000"), 30));
        developers.add(new Developer("oliver", new BigDecimal("50000"), 15));
        return developers;
    }
}
