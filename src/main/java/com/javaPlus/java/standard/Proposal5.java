package com.javaPlus.java.standard;

// null值和空值威胁到变长方法举例

public class Proposal5 {

    public void method(String str, Integer... is) {
    }

    public void method(String str, String... strs) {
    }

    public static void main(String[] args) {
        Proposal5 proposal = new Proposal5();
        proposal.method("China", 0);
        proposal.method("China", "people");
        // 下面两个方法编译不通过,提示是方法模糊不清
//        proposal.method("China"); 这个方法的"China"满足上面两个重载方法第一个参数的格式,但是传入的变长参数可以是0个及以上,所以编译器不知道该调用哪个方法

//        proposal.method("China", null); 这个方法的原因在于null满足上面两个重载的可变长度的参数,所以也造成了编译器不知道该调用哪个方法

    }
}
