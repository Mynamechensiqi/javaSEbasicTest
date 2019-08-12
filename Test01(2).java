package com.over;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.08
 * @apiNote 继承（测试）
 **/
public class Test01 {
    public static void main(String[] args) {
        String[] options = {"珠穆朗玛峰", "乔格里峰", "马戈尔峰"};
        SingleQuestion singleQuestion = new SingleQuestion(1,"最高的山峰",options,"乔格里峰");
        System.out.print(singleQuestion.id);
        System.out.print(singleQuestion.text);
        System.out.println(singleQuestion.answer);
        String[] answer = {"珠穆朗玛峰"};
        boolean check = singleQuestion.check(answer);
        System.out.println(check);
    }
}
