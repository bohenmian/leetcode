package com.javaPlus.designpattern.strategy;

/**
 * 策略模式的好处: 如果不使用策略模式,提供一种场景,如果需要提供多种查找算法,可以将这些算法写到一个类中,每一个方法对应一种查找算法,或者采用if else switch等条件语句
 * 上述写到类中或者使用条件语句都是采用硬编码方式,如果增加一种算法就需要修改类的源代码,不符合开闭原则
 * 策略模式可以很好的解决这个问题,我们首先提供一个策略接口,如果增加一种算法,则是增加了一个实现了策略接口的类(没有对源代码进行修改)
 * 再提供一个使用策略的类,客户端通过调用context传入具体的算法就可以实现功能(策略模式是算法和对象分开,降低了耦合性,便于扩展)
 *
 * 缺点: 客户端必须知道所有的策略类,并自行决定使用哪一个策略类.同时每一种策略都有一个具体的实现,会造成产生很多策略(可以用工厂方法优化)
 */
public class StrategyDemo {

    public static void main(String[] args) {

        Context context = new Context(new RedPen());

        context.executeDraw(10, 0, 0);
    }
}
