package com.zuoye;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName Rectangle1
 * @date 2019/8/10
 * @description
 **/
public class Rectangle1 extends Shape1 {
    int x;

    //重写计算正方形面积的方法
    public static double area(int x){

        return Math.pow(x,2);
    }
}
