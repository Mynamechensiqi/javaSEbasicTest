package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.09
 * @description
 *
 * 1.输出父类的静态语句块
 * 2.子类的静态语句块
 * 3.父类普通的语句块
 * 4.父类的构造方法
 * 5.子类普通的语句块
 * 6.子类的构造方法
 **/
public class A {
    static{
        System.out.println("1");
    }
    {
        System.out.println("3");
    }
    public A(){
        System.out.println("4");
    }

    public static void main(String[] args) {
        new B();
    }
}
