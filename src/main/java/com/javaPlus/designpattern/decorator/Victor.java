package com.javaPlus.designpattern.decorator;

/**
 * 具体组件角色
 */
public class Victor implements Hero {

    @Override
    public void init() {
        System.out.println("维克托：输出型英雄 武器：步枪");
    }
}
