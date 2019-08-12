package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote
 **/
public class Point {
    int x;
    int y;

    /** 构造器 */
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p = new Point(3,5);
        Point p2 = new Point(4, 5);
        System.out.println(p.x + " " + p2.x);
    }
}
