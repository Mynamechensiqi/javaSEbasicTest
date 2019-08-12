package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.09
 * @description 执行优先级：静态代码块 > main方法 > 构造代码块 > 构造方法
 **/
public class B extends A{
    static{
        System.out.println("2");
    }
    public B(){
        System.out.println("6");
    }
    {
        System.out.println("5");
    }
}
