package com.pol;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName PrintTest
 * @date 2019/8/13
 * @description 打印机测试类
 **/
public class PrintTest {
    public static void main(String[] args){
        // 多态条件
        // 继承  重写  向上转型
        // 赋值多态
        Printer printer = new ColorfulPrinter();
        printer.print();

        // 传参多态
        BlackAndWhitePrinter bawp = new BlackAndWhitePrinter();
        toPrint(bawp);
    }

    // 定义要打印的方法
    public static void toPrint(Printer printer){
        printer.print();
    }
}
