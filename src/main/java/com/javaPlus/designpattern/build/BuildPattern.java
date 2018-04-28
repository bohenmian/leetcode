package com.javaPlus.designpattern.build;

/**
 * 建造者模式:适用于复杂对象的创建,内部变化复杂的对象,将创建对象的步骤分为多个流程.如sqlSessionFactoryBuilder
 * 优点: 建造者独立,易扩展,各个步骤之间互不影响
 */
public class BuildPattern {

    public static void main(String[] args) {
        //通过UserBuilder获得User对象
        User user = User.builder()
                .setName("jack")
                .setPassword("123")
                .setAge(18)
                .build();//链式的设置属性,最后构建对象

    }
}
