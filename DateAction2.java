package com.str;

import java.util.Calendar;
import java.util.Date;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName DateAction2
 * @date 2019/8/12
 * @description 计算当前日期加上100天之后的日期
 **/
public class DateAction2 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.DAY_OF_WEEK, 100);        // num为增加的天数，可以改变的
        System.out.println("增加天数以后的日期：" + ca.getTime());
    }
}
