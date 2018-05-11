package com.javaPlus.designpattern.decorator;

/**
 * 具体装饰器角色,向组件添加职责
 */
public class GalacticWarriors extends HeroDecorator {

    public GalacticWarriors(Hero heroDecorator) {
        super(heroDecorator);
    }

    @Override
    public void init() {
        super.init();
        setSkin();
    }

    private void setSkin() {
        System.out.println("皮肤:银河战士套装");
    }
}
