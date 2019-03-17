package com.javaPlus.java.standard;

public class Proposal6 {

    public static void main(String[] args) {
        // base对象编译时特性由Base类决定,运行时由Sub决定,所以在编译时显示的仍然是父类Base的参数列表,第二个变长参数会被编译为数组
        Base base = new Sub();
        base.fun(100, 50);

        Sub sub = new Sub();

        // 下面执行语句会编译错误,原因是因为这里不会做上转型,50也不会做类型转换,50和{50}之间没有任何联系,所以也不会做任何类型转换,类型不匹配当然编译不通过
//        sub.fun(100, 50);
    }

}


class Base {
    void fun(int price, int... discounts) {
        System.out.println("Base..... fun");
    }
}

class Sub extends Base {
    // 这里的Override并没有错,因为父类的可变参数编译后就是一个int类型的数组
    @Override
    void fun(int price, int[] discounts) {
        System.out.println("Sub..... fun");
    }
}