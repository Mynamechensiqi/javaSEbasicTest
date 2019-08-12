package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.09
 * @apiNote 定义一个人类Person：
 *    定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
 *    有三个属性：名字、身高、体重
 **/
public class Person {
    String name;
    double heigth;
    int weigth;

    public void sayHello(String name){
        System.out.println("hello,my name is "+name);
    }
}
