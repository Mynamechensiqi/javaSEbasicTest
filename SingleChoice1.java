package com.zuoye;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName SingleChoice1
 * @date 2019/8/10
 * @description 单选题
 **/
public class SingleChoice1 extends Question1 {
    String[] options;     // 选项
    int answer;           // 单选标准答案

    //构造方法
    public SingleChoice1(String text, String[] options, int answer){
        this.text = text;
        this.options = options;
        this.answer = answer;
    }
    //重写检查的方法
    public boolean check(int[] myanswer){
        if (myanswer.length == 1 && answer == myanswer[0]){
            return true;
        }else{
            return false;
        }
    }
}
