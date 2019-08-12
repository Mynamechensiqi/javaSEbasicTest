package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.09
 * @description
 **/
public class Student {
    String name;
    int id;
    static int ss;
    public static void printss(){
        System.out.println(ss);
    }



    public void study(){
        System.out.println(name+"在上课");
    }
    public void sayHello(String sname){
        System.out.println(name+"向"+sname+"说你好！");
    }
}
