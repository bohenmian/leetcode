package com.javaPlus.designpattern.template;

public class TemplateDemo {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();

        template.templateMethod();
    }


}

