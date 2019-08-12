package com.lian;

import java.util.Arrays;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName Test01
 * @date 2019/8/12
 * @description
 **/
public class Test001 {
    //    static{
//        System.out.println("China");
//    }
//    {
//        System.out.println("你好");
//    }
//    public Test01() {
//        System.out.println("nice");
//    }
//    public Test01(String str) {
//        System.out.println(str);
//    }
//    public static void main(String[] args) {
//        new Test01("周一...");
//    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int a = 3;
        System.out.println("数组的值:" + Arrays.toString(nums));
        System.out.println("a的值:" + a);
        updateNum(a);
        updateArray(nums);
        System.out.println("数组的值:" + Arrays.toString(nums));
        System.out.println("a的值:" + a);
    }

    public static void updateNum(int a) {  // 传值 一个新的a赋值10
                                           // 只作用于updateNum里，updateNum执行结束后被销毁
        a = 10;
    }

    public static void updateArray(int[] a) {   // 传地址，将nums的地址传给updataArray
        a[0] = 10;
    }

}
