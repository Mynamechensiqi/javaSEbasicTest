package com.zuoye;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName Circle
 * @date 2019/8/10
 * @description 图形的子类
 **/
public class Circle1 extends Shape1 {

    int x;
    int y;

    public Circle1(int x,int y){
        this.x = x;
        this.y = y;
    }

    //重写计算圆形面积的方法
    public static double area(int r){

        return Math.PI * Math.pow(r,2);
    }

    //求距离
    public double getInstance(int x1,int y1){

        return Math.sqrt(Math.pow((this.x-x1),2) + Math.pow((this.y-y1),2));
    }
}
