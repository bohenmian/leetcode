package com.javaPlus.designpattern.decorator;

public class DecoratorPatternDemo {


    public static void main(String[] args) {
        Hero victor = new Victor();

        GalacticWarriors galacticWarriors = new GalacticWarriors(victor);

        galacticWarriors.init();
    }
}
