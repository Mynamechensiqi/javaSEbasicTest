package com.zuoye;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName Shape1
 * @date 2019/8/9
 * @description 图形类
 **/
public class Shape1 {
    Point1 p;  //图形的位置

    static int r;

    //计算面积
    public static double area(int r){

        return area(r);
    }

    public static void main(String[] args){
        System.out.println("圆形面积："+Circle.area(2));
        System.out.println("正方形面积："+Rectangle1.area(2));
        Circle circle = new Circle(2,2);
        if (circle.getInstance(2,3) <= r){
            System.out.println("点在圆内");
        }else{
            System.out.println("点不在圆内");
        }
    }
}
