package com.mxdx;

import java.awt.*;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote 练习（两点之间的距离）
 *
 *
 **/
public class Test1 {

    Point p;  // 圆心
    int r;    // 半径

    // 圆心
    public void center(Point p){
        this.p = p;
    }

    // 设一个点 到圆心的距离
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.p.x - p.x),2) + Math.pow((this.p.y - p.y),2));
    }

    public static void main(String[] args){
        Point point1 = new Point(2,3);
        Point point2 = new Point(2, 4);
        double instance = point1.getInstance(point2);
        System.out.println(instance);
    }
}
