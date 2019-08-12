package com.str;

/**
 * @ClassName Pack
 * @author chensiqi
 * @date 2019/8/12
 * @version 1.0
 * @description 包装类案例
 *
 **/

public class Pack {
    public static void main(String[] args) {
        int n = 8;
        Integer n1 = new Integer(n);
        System.out.println("int类型转换为integer类："+n1);
        Integer i = new Integer(50);
        int i1 = i.intValue();
        System.out.println("integer类型装换为int类型：" +i1);
    }
}
