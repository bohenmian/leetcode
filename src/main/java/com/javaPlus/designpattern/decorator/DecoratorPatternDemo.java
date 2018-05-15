package com.javaPlus.designpattern.decorator;

/**
 * 装饰器模式的好处: 可以动态的为对象添加一些额外的职责和行为,减少为了给对象增加职责造成的硬编码(如果按照传统的方式增加对象的职责是采用继承)
 * 传统的继承方式会只能静态的加入职责,不能控制增加行为的方式和时机
 */

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Hero victor = new Victor();

        GalacticWarriors galacticWarriors = new GalacticWarriors(victor);

        galacticWarriors.init();
    }
}
