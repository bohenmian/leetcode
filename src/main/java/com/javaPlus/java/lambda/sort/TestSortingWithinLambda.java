package com.javaPlus.java.lambda.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortingWithinLambda {

    public static void main(String[] args) {

        List<Developer> developers = getDevelopers();
        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println("name:" + developer.getName() + " salary:" + developer.getSalary() + " age:" + developer.getAge());
        }

        // 当需要排序的数据发生变化的时候,只需要重写Comparator类
        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

//        Collections.sort(developers, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        System.out.println("After Sort");
        for (Developer developer : developers) {
            System.out.println("name:" + developer.getName() + " salary:" + developer.getSalary() + " age:" + developer.getAge());
        }
    }

    private static List<Developer> getDevelopers() {
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("tom", new BigDecimal("70000"), 20));
        developers.add(new Developer("jack", new BigDecimal("80000"), 30));
        developers.add(new Developer("oliver", new BigDecimal("50000"), 15));
        return developers;
    }
}