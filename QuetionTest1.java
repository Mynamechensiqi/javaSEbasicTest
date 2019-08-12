package com.zuoye;

import java.util.Arrays;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName QuetionTest1
 * @date 2019/8/10
 * @description  考题测试类
 **/
public class QuetionTest1 {
    public static void main(String[] args) {
        // 单选
        String[] a = {"1.多民族的联邦制","2.多民族的单一制","3.民族区域自治"};
        SingleChoice1 singleChoice1 = new SingleChoice1("1.我国的国家结构是[]", a, 2);
        int[] myanswer = {2};
        System.out.println(singleChoice1.text);
        System.out.println(Arrays.toString(a));
        System.out.println("您给的答案是："+Arrays.toString(myanswer));
        System.out.println(singleChoice1.check(myanswer));
        System.out.println();

        // 多选
        String[] b = {"1.事先审查","2.宪法诉讼","3.违宪审查","4.附带性审查"};
        int[] answer = {1,2,4};
        MultiChoice1 multiChoice1 = new MultiChoice1("2.宪法实施保障的基本方式有[]",b,answer);
        int[] myanswers = {1,2};
        System.out.println(multiChoice1.text);
        System.out.println(Arrays.toString(b));
        System.out.println("您给的答案是："+Arrays.toString(myanswers));
        System.out.println(singleChoice1.check(myanswers));

    }
}
