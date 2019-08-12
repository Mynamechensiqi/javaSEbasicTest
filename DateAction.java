package com.str;

import java.util.Calendar;

/**
 * @ClassName DateAction
 * @author chensiqi
 * @date 2019/8/12
 * @version 1.0
 * @description Calendar类
 *
 **/
public class DateAction {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();        //实例化Calendar对象
        int year = c.get(Calendar.YEAR);            //通过get方法获得当前年
        int month = c.get(Calendar.MONTH) + 1;      //月份0-11，需要加1
        int day = c.get(Calendar.DAY_OF_MONTH);     //日期
        int hour = c.get(Calendar.HOUR_OF_DAY);     //获取小时
        int minute = c.get(Calendar.MINUTE);        //获取分钟
        int second = c.get(Calendar.SECOND);        //获取秒数
        System.out.println("当前时间：" + year + "年" + month + "月" + day + "日"
                + "   " + hour + ":" + minute + ":" + second);
    }
}
