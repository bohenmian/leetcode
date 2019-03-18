package com.javaPlus.java.lambda.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMapWithinLambda {

    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("tom", 30, new BigDecimal(10000)),
                new Staff("jack", 20, new BigDecimal(20000)),
                new Staff("oliver", 15, new BigDecimal(15000)));

        List<StaffPublic> staffPublics = convertToStaffPublic(staff);

        staffPublics.forEach(staffPublic -> System.out.println("name: " + staffPublic.getName() + " age:" + staffPublic.getAge()));
    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staffs) {
        List<StaffPublic> staffPublics = new ArrayList<>();

        for (Staff staff : staffs) {
            StaffPublic staffPublic = new StaffPublic();
            staffPublic.setName(staff.getName());
            staffPublic.setAge(staff.getAge());
            staffPublic.setSalary(staff.getSalary());
            staffPublics.add(staffPublic);
        }
        return staffPublics;
    }

}
