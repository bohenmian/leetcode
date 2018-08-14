package com.javaPlus.designpattern.proxy.staticproxy;

public class Food {

    private String chicken;

    private String spicy;

    private String noodle;

    private String salt;

    public Food() {
    }

    public Food(String chicken, String spicy, String salt) {
        this.chicken = chicken;
        this.spicy = spicy;
        this.salt = salt;
    }



    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
