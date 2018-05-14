package com.javaPlus.designpattern.composite;

/**
 * 结构型模式,组合型模式是一种层次的属性结构,如打印老板的高级经理及高级经理下的职员
 */

public class CompositeDemo {

    public static void main(String[] args) {
        //Employee对象
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        headSales.add(clerk1);
        headSales.add(clerk2);

        headMarketing.add(salesExecutive1);
        headMarketing.add(salesExecutive2);

        System.out.println(CEO);
        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);   //打印出CEO下级部门的职员以及下级部门职员的下级部门职员
            for (Employee employee1 : employee.getSubordinates()) {
                System.out.println(employee1);
            }
        }
    }
}
