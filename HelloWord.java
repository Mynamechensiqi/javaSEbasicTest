package com.str;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName HelloWord
 * @author chensiqi
 * @date 2019/8/12
 * @version 1.0
 * @description Java时间日期处理
 *
 **/
public class HelloWord {
    public static void main(String[] args) throws ParseException {
        // 使用format()方法将日期转换为指定格式的文本
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 创建Date对象，表示当前时间
        Date now = new Date();
        System.out.println(now);
        // 调用format()方法，将日期转换为字符串并输出
        System.out.println("1."+sdf1.format(now));
        System.out.println("2."+sdf2.format(now));
        System.out.println("3."+sdf3.format(now));

        // 使用parse()方法将文本转换为日期
        String d = "2019-08-11 21:56:36";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用parse()方法，将字符串转换为日期
        Date date = sdf.parse(d);
        System.out.println("4."+date);


        Date data = now;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("5."+simpleDateFormat);
        String format = simpleDateFormat.format(data);
        System.out.println("6."+format);
        System.out.println("7."+simpleDateFormat.format(data));


        String str = "2019/08/13 15:26:59";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date parse = simpleDateFormat1.parse(str);
        System.out.println("8."+parse);


    }
}
