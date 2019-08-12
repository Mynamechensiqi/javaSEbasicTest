package com.str;

/*
 * @author chensiqi
 * @version 1.0
 * @ClassName Test04
 * @date 2019/8/12
 * @description  string API测试
 **/
public class Test04 {
    public static void main(String[] args) {
        String str1 = "ilovejava";
        char c = str1.charAt(2);
        System.out.println(c);

        // concat
        String str2 = "hello";
        String concat = str1.concat(str2);
        System.out.println(concat);
    }
}
