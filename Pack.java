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
//        int n = 8;
//        Integer n1 = new Integer(n);

        Integer n2 = 9;
//        Integer n9 = Integer.valueOf(9);
        System.out.println("int类型转换为integer类："+n2); // 装箱
//        Integer i = new Integer(50);
//        int i1 = i.intValue();

        int i1 = 8;
//        int i1 = n2.intValue();
        System.out.println("integer类型装换为int类型：" +i1); // 拆箱
    }
}
