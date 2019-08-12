package com.zuoye;

import java.util.Arrays;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName MultiChoice1
 * @date 2019/8/10
 * @description 多选题
 **/
public class MultiChoice1 extends Question1 {
    String[] options;      // 选项
    int[] answers;         // 多选题标准答案

    //构造方法
    public MultiChoice1(String text, String[] options, int[] answer){
        this.text = text;
        this.options = options;
        this.answers = answers;
    }

    //重写检查的方法
    public boolean check(int[] myanswers){
        if (myanswers.length == this.answers.length && myanswers != null){
            Arrays.sort(myanswers);
            if (answers.equals(answers)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
