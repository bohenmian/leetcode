package com.javaPlus.designpattern.build;

public class User {

    private String name;

    private String password;

    private int age;

    //构造方法私有化,防止外部直接创建对象
    private User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    //用于获取UserBuilder对象
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    //静态内部类
    public static class UserBuilder {

        private String name;

        private String password;

        private int age;

        public String getName() {
            return name;
        }

        //链式调用,设置UserBuilder属性
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public int getAge() {
            return age;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        //构建User对象
        public User build() {
            if (name == null || password == null) {
                throw new RuntimeException();
            }
            if (age < 0 || age > 100) {
                throw new RuntimeException();
            }
            return new User(name, password, age);
        }
    }

}
