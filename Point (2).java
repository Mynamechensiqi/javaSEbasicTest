package com.mxdx;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote
 **/
public class Point {
    int x;
    int y;

    //声明一个带参的构造器，无参的会被覆盖
    //显示声明
//    public Point(){
//
//    }

    //构造器特点 不能声明返回值类型 与类同名
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(int c){
        //调用本类的其他构造器
        this(c,c);
    }

    //计算某点到原点的距离
    public double getInstance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    // 计算两点之间的距离
    public double getInstance(int x1,int y1){
        return Math.sqrt(Math.pow((this.x-x1),2) + Math.pow((this.y-y1),2));
    }

    // 使用面向对象的思维，求两点距离
    public double getInstance(Point p){
        return Math.sqrt(Math.pow((this.x-p.x),2) + Math.pow((this.y-p.y),2));
    }

    public static void main(String[] args) {
        Point point = new Point(1, 1);
        System.out.println(point.x);
        System.out.println(point.y);

        Point point1 = new Point(2);
        System.out.println(point1.x);
        System.out.println(point1.y);

        Point point2 = new Point(3, 4);
        double instance = point2.getInstance();
        System.out.println(instance);

        Point point3 = new Point(1, 1);
        double instance1 = point3.getInstance(0, 1);
        System.out.println(instance1);

        Point point4 = new Point(2, 2);
        Point point5 = new Point(2, 3);
        double instance2 = point4.getInstance(point5);
        System.out.println(instance2);
    }
}
