package com.over;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote 继承（子类）
 **/
public class SingleQuestion extends Question {
    String answer;        //标准答案

    public SingleQuestion(int id,String text,String[] options,String answer){
        this.id = id;
        this.text = text;
        this.options = options;
        this.answer = answer;
    }

    //重写，更新父类型的check行为
    public boolean check(String[] answer2){
        if (answer2 == null || answer2.length!=1){
            return false;
        }
        return this.answer.equals(answer2[0]);
    }
}
