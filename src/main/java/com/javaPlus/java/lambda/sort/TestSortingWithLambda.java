package com.javaPlus.java.lambda.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSortingWithLambda {

    public static void main(String[] args) {

        List<Developer> developers = getDevelopers();
        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println("name:" + developer.getName() + " salary:" + developer.getSalary() + " age:" + developer.getAge());
        }

        System.out.println("After Sort");

        developers.sort(Comparator.comparingInt(Developer::getAge));
        developers.forEach(developer -> System.out.println("name:" + developer.getName() + " salary:" + developer.getSalary() + " age:" + developer.getAge()));
    }


    private static List<Developer> getDevelopers() {

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("tom", new BigDecimal("60000"), 20));
        developers.add(new Developer("jack", new BigDecimal("80000"), 30));
        developers.add(new Developer("oliver", new BigDecimal("50000"), 15));
        return developers;
    }
}
