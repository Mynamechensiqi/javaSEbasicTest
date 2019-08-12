package com.mxdx;

import java.awt.*;
import java.util.Scanner;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.07
 *
 * 练习 2：实现圆（Circle）类
 * 1) 圆（Circle）类包含圆心（Point p）和半径（int r）两个属性
 * 3) 提供合理的构造器
 * 4) 提供方法：
 *  计算当前图形的面积
 *  计算当前图形是否包含(contains(Point))指定的点
 *  重载方法 contains(int x, int y) 图形是否包含坐标x,y
 **/
public class Circle {
    Point p;    // 圆心位置
    int r;    // 半径
    double area;    // 圆的面积

    // 圆心
    public void circleCenter(Point p){
        this.p = p;
    }

    // 点到圆心的距离
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.p.x - p.x), 2) + Math.pow((this.p.y - p.y), 2));
    }

    // 圆的面积
    public double area(int r){
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("输入圆心坐标x=");
        int x = scanner.nextInt();
        System.out.print("输入圆心坐标y=");
        int y = scanner.nextInt();
        Point p = new Point(x, y);
        circle.circleCenter(p);
        System.out.println("圆心的坐标=("+x+","+y+")");
        System.out.print("输入圆的半径长度r=");
        int r = scanner.nextInt();
        System.out.println("圆的面积=" + circle.area(r));

        System.out.print("输入另一个点坐标的x=");
        int x2 = scanner.nextInt();
        System.out.print("请输入另一个点坐标y=");
        int y2 = scanner.nextInt();
        System.out.println("另一个点的坐标==("+x2+","+y2+")");
        if(circle.distance(p) <= r){
            System.out.println("另一个点在圆里。");
        }else{
            System.out.println("另一个点不在圆里。");
        }
    }
}
