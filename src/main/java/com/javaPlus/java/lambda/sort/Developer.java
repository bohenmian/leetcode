package com.javaPlus.java.lambda.sort;

import java.math.BigDecimal;

public class Developer {

    private String name;
    private BigDecimal salary;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Developer(String name, BigDecimal salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
