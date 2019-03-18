package com.javaPlus.java.lambda.map;

/**
 * 使用map将一个对象转换为另外一个对象
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapWithLambda {

    public static void main(String[] args) {
        List<Staff> staffs = Arrays.asList(
                new Staff("tom", 40, new BigDecimal(45020)),
                new Staff("jack", 20, new BigDecimal(43201)),
                new Staff("oliver", 21, new BigDecimal(32499))
        );

        List<StaffPublic> staffPublics = staffs.stream()
                .map(staff -> {
                    StaffPublic staffPublic = new StaffPublic();
                    staffPublic.setName(staff.getName());
                    staffPublic.setAge(staff.getAge());
                    staffPublic.setSalary(staff.getSalary());
                    return staffPublic;
                }).collect(Collectors.toList());

        staffPublics.forEach(staffPublic -> System.out.println("name: " + staffPublic.getName() + " age: " + staffPublic.getAge()));

    }
}
