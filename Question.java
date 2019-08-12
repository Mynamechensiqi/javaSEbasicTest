package com.over;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote 继承（父类）
 *
 **/
public class Question {
    int id;                  //题号
    String text;             //题干
    String[] options = {};   //选项

    //检查答案
    public boolean check(String[] answers){
        return false;
    }

    //打印一个题目到控制台
    public void print(){
        System.out.println("题号："+id+";题干："+text);
        for (int i=0; i<options.length; i++){
            System.out.println(options[i]);
        }
    }
}

