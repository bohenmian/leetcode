package com.javaPlus.java.standard;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class GenerateRandomNumber {

    public String generateDistinctRandomNumber() {
        return ThreadLocalRandom
                .current()
                .ints(0, 9)
                .distinct()
                .limit(4)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}
